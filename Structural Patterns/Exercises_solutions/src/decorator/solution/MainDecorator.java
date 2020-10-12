package decorator.solution;

public class MainDecorator implements AbstractDecorator{
    private AbstractDecorator decorator;

    public MainDecorator(AbstractDecorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String render() {
        return decorator.render() + "[Main]";
    }
}
