package br.com.luciano;

import br.com.luciano.utils.ColorsUtils;
import marvin.image.MarvinImage;
import marvin.image.MarvinImageMask;
import marvin.io.MarvinImageIO;
import marvin.plugin.MarvinImagePlugin;
import org.marvinproject.image.color.blackAndWhite.BlackAndWhite;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import static marvin.MarvinPluginCollection.scale;

public class MarvinTest extends JFrame implements ActionListener {

        private static MarvinImage image;

        private static MarvinImagePlugin imagePlugin;

        private JPanel panelBottom;
        private JButton buttonTeste;
        private JButton buttonTeste2;
        private JLabel jLabel;

        private byte[] tempByte;

        public  MarvinTest() {

            super("Teste memoria");

            buttonTeste = new JButton("Mustang 10mb");
            buttonTeste.addActionListener(this);

            buttonTeste2 = new JButton("Roadster");
            buttonTeste2.addActionListener(this);

            panelBottom = new JPanel();
            panelBottom.add(buttonTeste);
            panelBottom.add(buttonTeste2);

            jLabel = new JLabel();

            Container l_c = getContentPane();
            l_c.setLayout(new BorderLayout());
            l_c.add(panelBottom, BorderLayout.SOUTH);
            l_c.add(jLabel, BorderLayout.CENTER);

            setSize(340,430);
            setVisible(true);
        }

        public static void main(String args[]) {
            MarvinTest t = new MarvinTest();
            t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    private static void runBlackWhite(String sourceFile) {
        String resourcePath = new File("src/main/resources/images").getAbsolutePath();
        File file = new File(resourcePath + File.separator + sourceFile + ".jpg");
        File fileResult = new File(resourcePath + File.separator + "result" + File.separator + sourceFile + "_bw.jpg");

        ColorsUtils.blackOrWhite(file, fileResult);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == buttonTeste) {
//            image = MarvinImageIO.loadImage("src/main/resources/images/mustang.jpg");
            for(int i = 0; i < 100; i++) {
                runBlackWhite("mustang");
                System.out.print(String.valueOf(i + "\n"));
            }
        }

        if (e.getSource() == buttonTeste2) {
            image = MarvinImageIO.loadImage("src/main/resources/images/roadster.jpg");
        }

        if (image != null) {
            jLabel.setText("andamento...");
            for(int i = 0; i < 100; i++) {
                imagePlugin = new BlackAndWhite();
                if (imagePlugin != null) {
                    imagePlugin.load();
                    imagePlugin.process(image, image, null, MarvinImageMask.NULL_MASK, false);

                    scale(image.clone(), image, 1600, 1200);

                    if (e.getSource() == buttonTeste) {
                        MarvinImageIO.saveImage(image, "src/main/resources/images/result/mustang_test.jpg");
                    }

                    if (e.getSource() == buttonTeste2) {
                        MarvinImageIO.saveImage(image, "src/main/resources/images/result/roadster_test.jpg");
                    }

                    image.update();
                    System.out.print(String.valueOf(i + "\n"));

                }
            }
            image = null;
            jLabel.setText("finalizado");
        }
    }

    private static void convertImage(BufferedImage bufferedImage) {
        try{


            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write( bufferedImage, "jpg", baos );
            baos.flush();
            byte[] imageInByte = baos.toByteArray();
            baos.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
 }

