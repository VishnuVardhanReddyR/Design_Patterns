package proxy.problem;

public class MainProxyPro {
    public static void main(String[] args){
        var library = new Library();
        String[] fileNames = {"a","b","c"};
        for(var fileName : fileNames){
            library.add(new Ebook(fileName));
        }
        library.openEbook("a");
    }
}
