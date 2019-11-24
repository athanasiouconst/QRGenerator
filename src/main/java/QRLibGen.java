import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import io.nayuki.qrcodegen.*;

public class QRLibGen {

    public static void main(String[] args) {

        QrCode qr0 = QrCode.encodeText("Constantinos Athanasiou Card!!", QrCode.Ecc.MEDIUM);
        BufferedImage img = qr0.toImage(4, 10);
        try {
            ImageIO.write(img, "jpg", new File("QRLibGen.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n\nYou have successfully created QR Code.");
    }
}
