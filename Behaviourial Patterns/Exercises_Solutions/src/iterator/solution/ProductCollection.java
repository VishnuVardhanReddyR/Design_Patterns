package iterator.solution;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ProductCollection {
  private Deque<Product> products = new ArrayDeque<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator createIterator(){
    return new ListIterator(this);
  }

  public class ListIterator implements Iterator{
    private ProductCollection collection;
    private int index;

    public ListIterator(ProductCollection collection) {
      this.collection = collection;
    }

    @Override
    public boolean hasNext() {
      return ( index < collection.products.size());
    }

    @Override
    public Object current() {
      return collection.products.pop();
    }

    @Override
    public void next() {
        index++;
    }
  }
}
