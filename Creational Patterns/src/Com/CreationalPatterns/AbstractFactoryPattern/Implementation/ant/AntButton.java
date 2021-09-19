package Com.CreationalPatterns.AbstractFactoryPattern.Implementation.ant;

import Com.CreationalPatterns.AbstractFactoryPattern.Implementation.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
