package webcam;

import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;


/**
 * Set view size before taking picture. It's worth to mention that size has to
 * be set before opening camera.
 * 
 * @author Bartosz Firyn (SarXos)
 */
public class TakePictureDifferentSizeExample {

	public static void main(String[] args) throws IOException {
		Webcam webcam = Webcam.getDefault();
		webcam.setViewSize(new Dimension(1024, 768));
		webcam.open();
		ImageIO.write(webcam.getImage(), "PNG", new File("test.png"));
		webcam.close();
	}

}
