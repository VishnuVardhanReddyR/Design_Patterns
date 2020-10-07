package memento.implementation;

public class EditorState {
    private final String content;
    // final will ensure that once we initialize this field, we cannot accidently change this in our program.
    // This will add robustness to our code.

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
