package decorator.solution;

public class Artefact implements AbstractDecorator {
    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return name;
    }
}
