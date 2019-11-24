import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TakePictureExample {

    public static void main(String[] args) throws IOException {

        // get default webcam and open it
        Webcam webcam = Webcam.getDefault();  //Here I get this error Unknown type "com.github.sarxos.webcam.Webcam"
        webcam.open();

        // get image
        BufferedImage image = webcam.getImage();

        // save image to PNG file
        ImageIO.write(image, "PNG", new File("./QRLibGen.jpg"));
    }
}
