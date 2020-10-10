package visitor.implementation;

public class HeadingNode implements HtmlNode {

    @Override
    public void execution(Operation operation) {
        operation.apply(this);
    }
}
