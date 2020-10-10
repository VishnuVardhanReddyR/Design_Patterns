package memento.problem;

public class MainMomentoPro {
    public static void main(String[] args){
        var editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        //editor.undo();
    }
}
