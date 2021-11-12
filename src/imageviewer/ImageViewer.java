package imageviewer;

import view.persistence.ImageLoader;
import view.persistence.files.FileImageLoader;

public class ImageViewer {

    public static void main(String[] args) {

        ImageLoader imageLoader = new FileImageLoader("D:\\NetBeansApplications\\ImageViewer\\image.jpg");
        
        MainFrame mainFrame = new MainFrame();
        
        mainFrame.getImageDisplay().display(imageLoader.load());
        mainFrame.setVisible(true);
    }
    
}
