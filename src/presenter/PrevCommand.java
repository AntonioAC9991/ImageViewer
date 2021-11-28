package presenter;

public class PrevCommand implements Command {
    @Override
    public String name() {
        return "Previous";
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
