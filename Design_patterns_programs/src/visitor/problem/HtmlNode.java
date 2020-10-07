package visitor.problem;

public interface HtmlNode {
    void highlight();
    // later lets say we want to implement a new functionality like document with only plain text.for that we need class like
    // String plainText();
    // again this class has to be implemented in every concrete class that implements this Interface.
    // As well as our HTML Document class. create a method plain text and we have to iterate through the objects in this method.
    // this violates the open,close principle.
    // because everytime we want to introduce a new operation we have to change every type in our object structure.
    // This is the problem that the visitor pattern try to solve.
    // It allows us to add new operations to an object structure without modifying it.
}
