package Com.CreationalPatterns.AbstractFactoryPattern.Implementation.app;

import Com.CreationalPatterns.AbstractFactoryPattern.Implementation.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory){
        factory.createButton().render();
        factory.createTextBox().render();
    }
}
