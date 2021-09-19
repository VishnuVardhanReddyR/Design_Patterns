package Com.CreationalPatterns.AbstractFactoryPattern.problem.ant;

import Com.CreationalPatterns.AbstractFactoryPattern.problem.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
