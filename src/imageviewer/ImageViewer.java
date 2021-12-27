package imageviewer;

import presenter.Command;
import presenter.NextCommand;
import presenter.PrevCommand;
import view.persistence.ImageLoader;
import view.persistence.files.FileImageLoader;

public class ImageViewer {

    public static void main(String[] args) {
        
        ImageLoader imageLoader = new FileImageLoader("D:\\NetBeansApplications\\ImageViewer\\image");
        
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().display(imageLoader.load());
        Command next = new NextCommand(mainFrame,imageLoader);
        Command prev = new PrevCommand(mainFrame,imageLoader);
        mainFrame.add(next);
        mainFrame.add(prev);
    }
    
}




