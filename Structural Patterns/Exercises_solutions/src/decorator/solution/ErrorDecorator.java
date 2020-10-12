package decorator.solution;

public class ErrorDecorator implements AbstractDecorator{
    private AbstractDecorator decorator;

    public ErrorDecorator(AbstractDecorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String render() {
        return decorator.render() + "[Error]";
    }
}
