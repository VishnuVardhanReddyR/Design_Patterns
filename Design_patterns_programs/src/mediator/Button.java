package mediator;

public class Button extends UIControl{
    private boolean isEnabled;

    public Button(DialogueBox owner) {
        super(owner);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        owner.changed(this);
    }
}
