import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class SnapImg {
    public static void main(String[] args) throws IOException {
        SnapImg();
    }

    public static void SnapImg() throws IOException {
        try {
            Webcam wc = Webcam.getDefault();
            wc.open();
            File tgt = new File("./cam.png");
            if (tgt.exists()) {
                tgt.delete();
            }
            ImageIO.write(wc.getImage(), "PNG", tgt);
            System.out.println("[CamBot] Successfully snapped a shot!");
        } catch (Exception e) {
            System.out.println("[CamBot] Encountered an exception: " + e);
        }
    }
}
