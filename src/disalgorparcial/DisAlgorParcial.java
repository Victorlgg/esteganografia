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
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class DisAlgorParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //https://www.mkyong.com/swing/java-swing-joptionpane-showoptiondialog-example/
        String[] options = {"Introducir Texto", "Leer .txt"};

        int opcionTexto = JOptionPane.showOptionDialog(null, "¿Introducir texto o leer de texto.txt?",
                "Ingrese la opción",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        File originalImage = new File("./src/Imagen/peppa.jpg");
        String dato="";
//        BufferedImage img = null;
        try {
            //************************************************************** 
            if(opcionTexto==0){
                dato = JOptionPane.showInputDialog("Ingrese el texto a guardar, finalice con un punto");
                
            }else{
            FileReader fr = new FileReader("./src/Imagen/Texto.txt");
            BufferedReader bf = new BufferedReader(fr);
            // String Mensaje="Este mensaje es guardado";
            dato = bf.readLine();
            }//Fin IF
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
                        //Numeros
                        if (arrayLetras[i] == '0') {r = 48; } if (arrayLetras[i] == '1') {r = 49;}
                        if (arrayLetras[i] == '2') {r = 50; } if (arrayLetras[i] == '3') {r = 51;}
                        if (arrayLetras[i] == '4') {r = 52;} if (arrayLetras[i] == '5') {r = 53;}
                        if (arrayLetras[i] == '6') {r = 54;} if (arrayLetras[i] == '7') {r = 55;}
                        if (arrayLetras[i] == '8') {r = 56;} if (arrayLetras[i] == '9') {r = 57;}
                        //Mayuscula
                        if (arrayLetras[i] == 'A') {r = 97; } if (arrayLetras[i] == 'B') {r = 98;}
                        if (arrayLetras[i] == 'C') {r = 99; } if (arrayLetras[i] == 'D') {r = 100;}
                        if (arrayLetras[i] == 'E') {r = 101;} if (arrayLetras[i] == 'F') {r = 102;}
                        if (arrayLetras[i] == 'G') {r = 103;} if (arrayLetras[i] == 'H') {r = 104;}
                        if (arrayLetras[i] == 'I') {r = 105;} if (arrayLetras[i] == 'J') {r = 106;}
                        if (arrayLetras[i] == 'K') {r = 107;} if (arrayLetras[i] == 'L') {r = 108;}
                        if (arrayLetras[i] == 'M') {r = 109;} if (arrayLetras[i] == 'N') {r = 110;}
                        if (arrayLetras[i] == 'O') {r = 111;} if (arrayLetras[i] == 'P') {r = 112;}
                        if (arrayLetras[i] == 'Q') {r = 113;} if (arrayLetras[i] == 'R') {r = 114;}
                        if (arrayLetras[i] == 'S') {r = 115;} if (arrayLetras[i] == 'T') {r = 116;}
                        if (arrayLetras[i] == 'U') {r = 117;} if (arrayLetras[i] == 'V') {r = 118;}
                        if (arrayLetras[i] == 'W') {r = 119;} if (arrayLetras[i] == 'X') {r = 120;}
                        if (arrayLetras[i] == 'Y') {r = 121;} if (arrayLetras[i] == 'Z') {r = 122;}
                        //Minuscula
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
        }//Fin Try Catch

    }//Fin Main

}//Fin Clase
