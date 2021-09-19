package Com.CreationalPatterns.AbstractFactoryPattern.Implementation;

import Com.CreationalPatterns.AbstractFactoryPattern.Implementation.app.ContactForm;
import Com.CreationalPatterns.AbstractFactoryPattern.Implementation.material.MaterialWidgetFactory;

public class AFPMain {
    public static void main(String[] args){
        new ContactForm().render(new MaterialWidgetFactory());
    }
}
