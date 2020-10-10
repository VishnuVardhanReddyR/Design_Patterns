package iterator.implementation;

import iterator.problem.BrowserHistory;

public class MainIteratorImp {
    public static void main(String[] args){
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        history.push("d");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
