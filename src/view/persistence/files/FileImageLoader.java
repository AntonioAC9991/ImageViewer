/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.persistence.files;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Image;
import view.persistence.ImageLoader;

/**
 *
 * @author AntonioAguado
 */
public class FileImageLoader implements ImageLoader {

    private final String filename;

    public FileImageLoader(String filename) {
        this.filename = filename;
    }

    
    
    //TODO
    @Override
    public Image load() {
        
        return new Image() {
            @Override
            public byte[] bitmap() {
                FileInputStream is = null;
                try {
                    is = new FileInputStream(filename);
                    return read(is);
                } catch (FileNotFoundException ex) {
                    System.out.println("" + ex.getMessage());
                    return null;
                }
            }

            private byte[] read(FileInputStream is) {
                byte[] buffer = new byte[4096];
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                while(true) {
                    try {
                        int length = is.read(buffer);
                        if(length < 0) {
                            break;
                        }
                        os.write(buffer, 0, length);
                    } catch (IOException ex) {
                        System.out.println("" + ex.getMessage());
                        return null;
                    }
                }
                return os.toByteArray();
            }
            
        };
        
    }
    
}
