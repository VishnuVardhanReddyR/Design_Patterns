package visitor.implementation;

public class PlainTextOperation implements Operation{

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Heading plain text");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("anchor plain text");

    }
}
