package mediator;

public class TextBox extends UIControl {
    private String content;

    public TextBox(DialogueBox owner) {
        super(owner);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        owner.changed(this);
    }
}
