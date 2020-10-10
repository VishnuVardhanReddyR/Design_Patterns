package mediator;

public class ListBox extends UIControl {
    private String selection;

    public ListBox(DialogueBox owner) {
        super(owner);
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        owner.changed(this);
    }
}
