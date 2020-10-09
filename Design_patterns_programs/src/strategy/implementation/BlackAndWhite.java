package strategy.implementation;

public class BlackAndWhite implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applied black and white filter on " + fileName);
    }
}
