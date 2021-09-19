package Com.CreationalPatterns.AbstractFactoryPattern.problem.app;

import Com.CreationalPatterns.AbstractFactoryPattern.problem.Theme;
import Com.CreationalPatterns.AbstractFactoryPattern.problem.ant.AntButton;
import Com.CreationalPatterns.AbstractFactoryPattern.problem.ant.AntTextBox;
import Com.CreationalPatterns.AbstractFactoryPattern.problem.material.MaterialButton;
import Com.CreationalPatterns.AbstractFactoryPattern.problem.material.MaterialTextBox;

public class ContactForm {
    public void render(Theme theme){
        if(theme == Theme.ANT){
            new AntButton().render();
            new AntTextBox().render();
        }
        else if(theme == Theme.MATERIAL){
            new MaterialButton().render();
            new MaterialTextBox().render();
        }
    }
}
