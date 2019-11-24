import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;

public class CameraTEst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        System.out.println("\n\nYou have starting created QR Code.");
        // get default webcam and open it
        Webcam webcam = Webcam.getDefault();
        webcam.open();

        // get image
        BufferedImage image = webcam.getImage();

        // save image to PNG file

        ImageIO.write(image, "jpg", new File("./Test.png"));
        System.out.println("\n\nYou have successfully created QR Code.");
    }
}
