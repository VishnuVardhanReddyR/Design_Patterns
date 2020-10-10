package command.undo;

public class MainCommandUndo {
    public static void main(String[] args){
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("hello world");

        var boldCommand = new BoldCommand(document,history);
        boldCommand.execute();
        System.out.println(document.getContent());
//        boldCommand.unexecute();
//        System.out.println(document.getContent());

//        we are not gonna directly call the unexecute method of this command.
//        Because someWhere in our application we have UNDO command.
//        That command should be connected to the undo menu-item on top of applications window.
//        So,instead of calling unexecute method, we should create an undo command object.

        var undocommand = new UndoCommand(history);
        undocommand.execute();
        System.out.println(document.getContent());
    }
}
