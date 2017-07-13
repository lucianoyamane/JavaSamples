import br.com.compressjpg.CompressJPG;

import java.io.File;
import java.net.URL;

/**
 * Created by luciano on 13/07/17.
 */
public class MainTest {

    public static void main(String[] args) {

        String[] files = new String[] { "mustang", "roadster" };
        for(String file : files) {
            runCompress(file);
        }
    }

    private static void runCompress(String sourceFile) {
        String resourcePath = new File("src/main/resources/images").getAbsolutePath();

        File file = new File(resourcePath + File.separator + sourceFile + ".jpg");
        File fileResult = new File(resourcePath + File.separator + sourceFile + "_file.jpg");

        byte[] fileByte = CompressJPG.convertFileByteArray(resourcePath + File.separator + sourceFile + ".jpg");

        CompressJPG.compressImageJpg(0.3f, file, fileResult);

        byte[] resultado = CompressJPG.compressImageJpgByte(0.3f, fileByte);
        CompressJPG.convertByteArrayFile(resultado, resourcePath + File.separator + sourceFile + "_byte.jpg");
    }

}
