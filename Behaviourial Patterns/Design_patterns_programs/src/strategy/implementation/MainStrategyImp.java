package strategy.implementation;

public class MainStrategyImp {
    public static void main(String[] args){
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhite());
        imageStorage.store("a", new PngCompressor(), new HighContrast());
    }
}
