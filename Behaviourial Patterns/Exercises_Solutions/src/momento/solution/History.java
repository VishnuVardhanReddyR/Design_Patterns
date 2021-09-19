package momento.solution;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<DocumentState> states = new ArrayDeque<>();

    public void push(DocumentState state){
        states.push(state);
    }

    public DocumentState pop(){
        return states.pop();
    }
}
