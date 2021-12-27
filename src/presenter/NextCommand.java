package presenter;
import imageviewer.MainFrame;
import model.Image;
import view.ui.swing.SwingImageDisplay;
import view.persistence.ImageLoader;
import view.persistence.files.FileImageLoader;

public class NextCommand implements Command {
    
    private MainFrame mf;
    private SwingImageDisplay sid;
    private FileImageLoader fil;

    public NextCommand(MainFrame mainFrame,ImageLoader fileImageLoader) {
        mf = mainFrame;
        sid = mainFrame.getImageDisplay();
        fil = (FileImageLoader) fileImageLoader;
    }

    @Override
    public String name() {
        return "next";    
    }

    @Override
    public void execute() {
        sid.display(sid.getImage().next());
    }
    
}
