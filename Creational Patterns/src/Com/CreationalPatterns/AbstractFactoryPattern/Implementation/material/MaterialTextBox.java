package Com.CreationalPatterns.AbstractFactoryPattern.Implementation.material;

import Com.CreationalPatterns.AbstractFactoryPattern.Implementation.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
