package presenter;

import imageviewer.MainFrame;
import view.ui.swing.SwingImageDisplay;
import view.persistence.ImageLoader;
import view.persistence.files.FileImageLoader;

public class PrevCommand implements Command{
    
    private MainFrame mf;
    private SwingImageDisplay sid;
    private FileImageLoader fil;
    
    public PrevCommand(MainFrame mainFrame, ImageLoader imageLoader) {
        mf = mainFrame;
        sid = mainFrame.getImageDisplay();
        fil = (FileImageLoader) imageLoader;    
    }

    @Override
    public String name() {
        return "prev";
    }

    @Override
    public void execute() {
        sid.display(sid.getImage().previous());
    }
    
}
