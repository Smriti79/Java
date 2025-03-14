import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;

public class VoWiFiClient {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        int width = 640;
        int height = 480;

        // Initialize OpenCV
        VideoCapture camera = new VideoCapture(0);
        camera.set(Videoio.CAP_PROP_FRAME_WIDTH, width);
        camera.set(Videoio.CAP_PROP_FRAME_HEIGHT, height);

        // Create a socket to connect to the server
        int port = 9000;
        String serverAddress = "localhost";
        try (Socket socket = new Socket(serverAddress, port)) {
            InputStream inputStream = socket.getInputStream();

            // Create a JFrame to display the video frames
            JFrame frame = new JFrame("Video over Wi-Fi");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(width / 2, height / 2);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            // Create a JLabel to display the video frames
            JLabel label = new JLabel();
            frame.add(label);

            // Receive and display video frames in a loop
            while (true) {
                byte[] frameData = new byte[width * height];
                inputStream.read(frameData);

                // Convert the received byte array into a Mat object and display it
                Mat receivedFrame = new Mat(height / 2, width / 2, CV_8UC1);
                receivedFrame.put(0, 0, frameData);
                Imgproc.cvtColor(receivedFrame, receivedFrame, Imgproc.COLOR_GRAY2BGR);

                SwingUtilities.invokeLater(() -> {
                    label.setIcon(new ImageIcon(convertMatToBufferedImage(receivedFrame)));
                    frame.pack();
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Utility function to convert a Mat to a BufferedImage
    private static BufferedImage convertMatToBufferedImage(Mat mat) {
        int type = BufferedImage.TYPE_BYTE_GRAY;
        if (mat.channels() > 1) {
            type = BufferedImage.TYPE_3BYTE_BGR;
        }
        BufferedImage image = new BufferedImage(mat.width(), mat.height(), type);
        final byte[] targetPixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        mat.get(0, 0, targetPixels);
        return image;
    }
}