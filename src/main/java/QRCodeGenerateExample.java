import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenerateExample {

    public static void main(String[] args) {
        ByteArrayOutputStream stream = QRCode.from("I love you very much!!!!!!!")
                .to(ImageType.JPG).stream();

        try {
            FileOutputStream fileStream = new FileOutputStream(new File(
                    "./QRCodeGenerateExample.jpg"));

            fileStream.write(stream.toByteArray());

            fileStream.flush();
            fileStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n\nYou have successfully created QR Code.");
    }
}
