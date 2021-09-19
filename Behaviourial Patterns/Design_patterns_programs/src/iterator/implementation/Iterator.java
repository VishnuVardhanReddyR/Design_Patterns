package iterator.implementation;

public interface Iterator {
    boolean hasNext();
    String current();
    void next();
}

//public interface Iterator<T> {
//    boolean hasNext();
//    T current();
//    void next();
//}
// Now this is a general purpose or a generic interface.
// So, when we are using this interface we supply a value or type for this interface.
// some where in our code we may type,
// implement Iterator<String>
// that means the current method will return String object.
// implement Iterator<user>
// current method will return a user object.
