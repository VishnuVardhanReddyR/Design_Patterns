package strategy.implementation;

public class HighContrast implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("High Contrast is applied on " + fileName);
    }
}
