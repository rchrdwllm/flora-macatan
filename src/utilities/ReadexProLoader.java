/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

/**
 *
 * @author William
 */
public class ReadexProLoader {
    Font regular;
    Font semiBold;
    
    private void registerFont(Font font) {
        GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(font);
    }
    
    public Font readexPro(float size) {
        try {
            regular = Font.createFont(Font.TRUETYPE_FONT, ReadexProLoader.class.getResourceAsStream("../fonts/ReadexPro-Regular.ttf")).deriveFont(size);
        
            registerFont(regular);
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
        
        return regular;
    }
    
    public Font readexProSemiBold(float size) {
        try {
            semiBold = Font.createFont(Font.TRUETYPE_FONT, ReadexProLoader.class.getResourceAsStream("../fonts/ReadexPro-SemiBold.ttf")).deriveFont(size);
        
            registerFont(semiBold);
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
        
        return semiBold;
    }
}
