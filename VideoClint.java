import java.awt. image. BufferedImage;
import java.io.IOException;
 import java.io.ObjectInputStream;
 import java. net. ServerSocket;
import java.net.Socket;
import javax. swing.ImageIcon; import javax. swing. JFrame; import javax. swing.JLabel;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import javax.imageio.ImageIO;



public class VideoClint {
static Socket socket;
public static void main(String[] args) throws IOException {
Webcam webcam = webcam.getDefault();
webcam. open();
socket = new Socket ("localhost", 123);
BufferedImage bm = webcam.getImage();
ObjectOutputStream dout = new ObjectOutputstream(socket.getOutputstream());
ImageIcon im = new ImageIcon(bm);
JFrame frame = new JFrame ("PC 1");
frame.setSize(640,360);
frame. setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
JLabel l = new JLabel();
l.setVisible(true);
frame.add(l);
frame.setVisible(true);
while (true)
{
BufferedImage bm = webcam. getImage());

ObjectOutputStream dout = new ObjectOutputStream(socket.getOutputStream());
ImageIcon im = new ImageIcon(bm);
JFrame frame = new JFrame("PC 1");
frame. setSize(640,360);
frame. setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
JLabel l = new JLabel();
l.setVisible(true);
frame.add(l);
frame.setVisible(true);
while(true)
{
bm = webcam.getImage();
im =new ImageIcon(bm);
dout.writeObject(im);
l.setIcon(im);
dout.flush();
}
}
}
}