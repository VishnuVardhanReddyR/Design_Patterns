package Com.CreationalPatterns.AbstractFactoryPattern.Implementation.ant;

import Com.CreationalPatterns.AbstractFactoryPattern.Implementation.Button;
import Com.CreationalPatterns.AbstractFactoryPattern.Implementation.TextBox;
import Com.CreationalPatterns.AbstractFactoryPattern.Implementation.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
