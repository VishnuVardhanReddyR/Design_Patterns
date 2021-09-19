package Com.CreationalPatterns.AbstractFactoryPattern.problem.ant;

import Com.CreationalPatterns.AbstractFactoryPattern.problem.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
