package decorator.problem;

public class CompressedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        super.write(compress(data));
    }

    private String compress(String data){
        return data.substring(0,5);
    }
}
