/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disalgorparcial;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Victor
 */
public class Lector {

    FileWriter rutaNueva = null;
    String texto = "Texto recuperado: ";
    boolean fintexto = false;
    
    public void Traductor() {
        File ImagenLeer = new File("./src/Imagen/ImagenConTexto.jpg");
        BufferedImage img = null;
        try {
            img = ImageIO.read(ImagenLeer);
            rutaNueva = new FileWriter("./src/Imagen/TextoDeImagen.txt");
            
            for (int j = 0; j < img.getHeight(); j++) {
                for (int i = 0; i < img.getWidth(); i++) {

                    Color c = new Color(img.getRGB(i, j));
                    int r = c.getRed();
                    int g = c.getGreen();
                    int b = c.getBlue();
                    if (!fintexto) {
                        if ( r==97   ) {  texto+="a"; } if ( r==98   ) {  texto+="b"; }
                        if ( r==99   ) {  texto+="c"; } if ( r==100  ) {  texto+="d"; }
                        if ( r==101  ) {  texto+="e"; } if ( r==102  ) {  texto+="f"; }
                        if ( r==103  ) {  texto+="g"; } if ( r==104  ) {  texto+="h"; }
                        if ( r==105  ) {  texto+="i"; } if ( r==106  ) {  texto+="j"; }
                        if ( r==107  ) {  texto+="k"; } if ( r==108  ) {  texto+="l"; }
                        if ( r==109  ) {  texto+="m"; } if ( r==110  ) {  texto+="n"; }
                        if ( r==111  ) {  texto+="o"; } if ( r==112  ) {  texto+="p"; }
                        if ( r==113  ) {  texto+="q"; } if ( r==114  ) {  texto+="r"; }
                        if ( r==115  ) {  texto+="s"; } if ( r==116  ) {  texto+="t"; }
                        if ( r==117  ) {  texto+="u"; } if ( r==118  ) {  texto+="v"; }
                        if ( r==119  ) {  texto+="w"; } if ( r==120  ) {  texto+="x"; }
                        if ( r==121  ) {  texto+="y"; } if ( r==122  ) {  texto+="z"; }    
                        if (r == 32) {
                            texto += " ";
                        }
                        if (r == 0 && g == 255 && b == 0) {
                            //texto+="i:"+i+"j:"+j;
                            texto += ".";
                            fintexto = true;
                            System.out.println(texto);
                        }
                    }
                }
            }

            rutaNueva.append(texto);
            rutaNueva.close();
        } catch (IOException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
