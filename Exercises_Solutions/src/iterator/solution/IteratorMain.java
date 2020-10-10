package iterator.solution;

public class IteratorMain {
    public static void main(String[] args){
        var collection = new ProductCollection();
        collection.add(new Product(12,"PCs"));
        collection.add(new Product(86,"tabs"));
        collection.add(new Product(14,"mobiles"));
        collection.add(new Product(121,"laptops"));
        collection.add(new Product(11,"Rams"));

        Iterator iterator = collection.createIterator();
        while (iterator.hasNext()){
            var product = iterator.current();
            System.out.println(product.toString());
            iterator.next();
        }
    }
}
