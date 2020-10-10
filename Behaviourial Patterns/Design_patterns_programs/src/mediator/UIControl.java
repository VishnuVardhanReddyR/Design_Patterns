package mediator;

public class UIControl {
    protected DialogueBox owner;       // private members are not inherited by sub classes so protected.

    public UIControl(DialogueBox owner) {
        this.owner = owner;
    }
}
