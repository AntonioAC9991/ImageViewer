package presenter;
public class NextCommand implements Command{
    @Override
    public String name() {
        return "Next";
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
