package command.undo;

public class UndoCommand implements Command{
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        //history.pop().unexecute();
        // there is a problem with this application what if there is nothing in the history? This code is gonna throw exceptions.
        if (history.size() > 0){
            history.pop().unexecute();
        }
    }
}
