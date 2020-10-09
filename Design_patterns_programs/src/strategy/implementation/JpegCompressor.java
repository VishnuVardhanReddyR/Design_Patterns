package strategy.implementation;

public class JpegCompressor implements Compressor{

    @Override
    public void compress(String fileName) {
        System.out.println("compressing using JPEG");
    }
}
