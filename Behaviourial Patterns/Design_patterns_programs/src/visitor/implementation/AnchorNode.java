package visitor.implementation;

public class AnchorNode implements HtmlNode {

    @Override
    public void execution(Operation operation) {
        operation.apply(this);
    }
}
