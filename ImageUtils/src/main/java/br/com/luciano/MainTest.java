package br.com.luciano;
import br.com.luciano.utils.ColorsUtils;
import br.com.luciano.utils.CompressJPGUtils;

import java.io.File;

/**
 * Created by luciano on 13/07/17.
 */
public class MainTest {

    public static void main(String[] args) {

        String[] files = new String[] { "mustang", "roadster" };
        for(String file : files) {
            //runCompress(file);
            runBlackWhite(file);
        }
    }

    private static void runBlackWhite(String sourceFile) {
        String resourcePath = new File("src/main/resources/images").getAbsolutePath();
        File file = new File(resourcePath + File.separator + sourceFile + ".jpg");
        File fileResult = new File(resourcePath + File.separator + sourceFile + "_bw.jpg");

        ColorsUtils.blackOrWhite(file, fileResult);
    }

    private static void runCompress(String sourceFile) {
        String resourcePath = new File("src/main/resources/images").getAbsolutePath();

        File file = new File(resourcePath + File.separator + sourceFile + ".jpg");
        File fileResult = new File(resourcePath + File.separator + sourceFile + "_file.jpg");

        CompressJPGUtils.compressImageJpg(0.3f, file, fileResult);

        byte[] fileByte = CompressJPGUtils.convertFileByteArray(resourcePath + File.separator + sourceFile + ".jpg");
        byte[] resultado = CompressJPGUtils.compressImageJpgByte(0.3f, fileByte);
        CompressJPGUtils.convertByteArrayFile(resultado, resourcePath + File.separator + sourceFile + "_byte.jpg");
    }

}
