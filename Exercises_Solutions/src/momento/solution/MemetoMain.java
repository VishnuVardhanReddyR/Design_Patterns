package momento.solution;

public class MemetoMain {
    public static void main(String[] args){
        var document = new Document();
        var history = new History();

        document.setContent("a");
        history.push(document.createState());
        document.setFontName("sans serif");
        history.push(document.createState());
        document.setFontSize(143);
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);


        document.restore(history.pop());
        System.out.println(document);
    }
}
