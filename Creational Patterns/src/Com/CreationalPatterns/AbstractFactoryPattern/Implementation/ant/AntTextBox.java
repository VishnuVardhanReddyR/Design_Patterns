package Com.CreationalPatterns.AbstractFactoryPattern.Implementation.ant;

import Com.CreationalPatterns.AbstractFactoryPattern.Implementation.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
