package strategy.implementation;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public void store(String fileName, Compressor compressor, Filter filter){
        compressor.compress(fileName);

        filter.apply(fileName);
    //JPEG,PNG ..
    //B&W, HIGH CONTRAST ..
    }
}
