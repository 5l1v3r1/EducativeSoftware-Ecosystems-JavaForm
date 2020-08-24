/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.awt.Font;
import java.io.InputStream;


public class FontX {
    private Font font = null;
    
    public Font changed(String fontName, float size)
    {
         try {
            //Se carga la fuente
            InputStream is =  getClass().getResourceAsStream(fontName.replace("\\","/"));
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);            
        }
        Font tfont = font.deriveFont(Font.PLAIN, size);
        return tfont;
    }
}
