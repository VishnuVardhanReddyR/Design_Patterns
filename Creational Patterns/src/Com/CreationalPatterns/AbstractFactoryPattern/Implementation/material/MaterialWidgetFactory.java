package Com.CreationalPatterns.AbstractFactoryPattern.Implementation.material;

import Com.CreationalPatterns.AbstractFactoryPattern.Implementation.Button;
import Com.CreationalPatterns.AbstractFactoryPattern.Implementation.TextBox;
import Com.CreationalPatterns.AbstractFactoryPattern.Implementation.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
