package ImageViewer;

import presenter.NextCommand;
import presenter.PrevCommand;
import view.persistence.ImageLoader;
import view.persistence.files.FileImageLoader;

public class ImageViewer {

    public static void main(String[] args) {
        
        ImageLoader imageLoader = new FileImageLoader("D:\\NetBeansApplications\\ImageViewer\\image.jpg");
        
        MainFrame mainFrame = new MainFrame();
        NextCommand nextCommand = new NextCommand();
        PrevCommand prevCommand = new PrevCommand();
        
        mainFrame.add(prevCommand);
        mainFrame.add(nextCommand);
        
        mainFrame.getImageDisplay().display(imageLoader.load());
    }
    
}




