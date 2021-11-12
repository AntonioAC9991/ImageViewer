/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.ui.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.PopupMenu;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import model.Image;
import view.ui.ImageDisplay;

/**
 *
 * @author AntonioAguado
 */
public class SwingImageDisplay extends JPanel implements ImageDisplay{

    private Image image;

    public SwingImageDisplay() {
        super(new BorderLayout());
    }
    
    
    @Override
    public void display(Image image) {
        this.image = image;
        this.removeAll();
        this.add(imagePanel());
    }

    private Component imagePanel() {
        return new JPanel(){
            @Override
            public void paint(Graphics g){
                g.drawImage(bitmap(), 0, 0, this.getWidth(), this.getHeight(), null);
            }
            private java.awt.Image bitmap(){
                try{
                    return ImageIO.read(new ByteArrayInputStream(image.bitmap()));
                }catch(IOException ex) {
                    System.out.println("" + ex.getMessage());
                    return null;
                }
               
                
            }
        };
    }
    
}
