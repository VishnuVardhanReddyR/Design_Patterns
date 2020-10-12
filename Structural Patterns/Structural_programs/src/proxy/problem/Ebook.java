package proxy.problem;

public class Ebook {
    private String fileName;

    public Ebook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load(){
        System.out.println("Loading the Ebook " + fileName);
    }

    public void show(){
        System.out.println("Showing the Ebook " + fileName);
    }

    public String getFileName() {
        return fileName;
    }
}
