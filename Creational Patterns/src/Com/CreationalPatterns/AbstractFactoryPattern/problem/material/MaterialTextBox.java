package Com.CreationalPatterns.AbstractFactoryPattern.problem.material;

import Com.CreationalPatterns.AbstractFactoryPattern.problem.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
