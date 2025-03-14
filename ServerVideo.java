import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class VoWiFiServer {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        int width = 640;
        int height = 480;
        int fps = 30;
        VideoCapture camera = new VideoCapture(0);
        camera.set(Videoio.CAP_PROP_FRAME_WIDTH, width);
        camera.set(Videoio.CAP_PROP_FRAME_HEIGHT, height);
        camera.set(Videoio.CAP_PROP_FPS, fps);

        int port = 9000;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");
                Mat frame = new Mat();
                camera.read(frame);
                if (!frame.empty()) {
                    processAndSendFrame(frame, clientSocket);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (camera != null) {
                camera.release();
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void processAndSendFrame(Mat frame, Socket clientSocket) {
        Mat resizedFrame = new Mat();
        Imgproc.resize(frame, resizedFrame, new Size(width / 2, height / 2));
        Mat grayFrame = new Mat();
        Imgproc.cvtColor(resizedFrame, grayFrame, Imgproc.COLOR_BGR2GRAY);

        try (OutputStream outputStream = clientSocket.getOutputStream()) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(grayFrame.tobytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
