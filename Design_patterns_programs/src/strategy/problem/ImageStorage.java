package strategy.problem;

public class ImageStorage {
    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(){
        if(compressor == "JPEG")
            System.out.println("compressing using JPEG");
        else if(compressor == "PNG")
            System.out.println("compressing using PNG");

        if(filter == "b&w")
            System.out.println("Applying b&w filter");
        else if (filter == "high-contrast")
            System.out.println("Applying high-contrast filter");
    //JPEG,PNG ..
    //B&W, HIGH CONTRAST ..
    }
}
