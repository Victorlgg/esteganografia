/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disalgorparcial;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Victor
 */
public class DisAlgorParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File originalImage = new File("./src/Imagen/peppa.jpg");

//        BufferedImage img = null;
        try {
            //**************************************************************    
            FileReader fr = new FileReader("./src/Imagen/Texto.txt");
            BufferedReader bf = new BufferedReader(fr);
            // String Mensaje="Este mensaje es guardado";
            String dato = "";
            String temp = "";
            while (temp != null) {
                //y=0;
                temp = bf.readLine();
                if (temp == null) {
                    break;
                }
                dato = temp;
            }
            char[] arrayLetras = dato.toCharArray();
            //**************************************************************

            BufferedImage img = ImageIO.read(originalImage);

            BufferedImage imagenNueva = new BufferedImage(
                    img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);
            int x = 0;
            for (int j = 0; j < img.getHeight(); j++) {
                for (int i = 0; i < img.getWidth(); i++) {
                    //Get RGB Color on each pixel
                    Color c = new Color(img.getRGB(i, j));
                    int r = c.getRed(); int g = c.getGreen(); int b = c.getBlue();

                    if (x < arrayLetras.length) {
                        if (arrayLetras[i] == 'a') {r = 97; } if (arrayLetras[i] == 'b') {r = 98;}
                        if (arrayLetras[i] == 'c') {r = 99; } if (arrayLetras[i] == 'd') {r = 100;}
                        if (arrayLetras[i] == 'e') {r = 101;} if (arrayLetras[i] == 'f') {r = 102;}
                        if (arrayLetras[i] == 'g') {r = 103;} if (arrayLetras[i] == 'h') {r = 104;}
                        if (arrayLetras[i] == 'i') {r = 105;} if (arrayLetras[i] == 'j') {r = 106;}
                        if (arrayLetras[i] == 'k') {r = 107;} if (arrayLetras[i] == 'l') {r = 108;}
                        if (arrayLetras[i] == 'm') {r = 109;} if (arrayLetras[i] == 'n') {r = 110;}
                        if (arrayLetras[i] == 'o') {r = 111;} if (arrayLetras[i] == 'p') {r = 112;}
                        if (arrayLetras[i] == 'q') {r = 113;} if (arrayLetras[i] == 'r') {r = 114;}
                        if (arrayLetras[i] == 's') {r = 115;} if (arrayLetras[i] == 't') {r = 116;}
                        if (arrayLetras[i] == 'u') {r = 117;} if (arrayLetras[i] == 'v') {r = 118;}
                        if (arrayLetras[i] == 'w') {r = 119;} if (arrayLetras[i] == 'x') {r = 120;}
                        if (arrayLetras[i] == 'y') {r = 121;} if (arrayLetras[i] == 'z') {r = 122;}
                        if (arrayLetras[i] == ' ') {r = 32;}
                        if (arrayLetras[i] == '.') {
                            r = 0;  g = 255; b = 0;
                        }
                        x++;
                    }
                    Color gColor = new Color(r, g, b);
                    imagenNueva.setRGB(i, j, gColor.getRGB());
                }
            }
            ImageIO.write(imagenNueva, "png", new File("./src/Imagen/ImagenConTexto.jpg"));

            Lector l = new Lector();
            l.Traductor();
        } catch (IOException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
