package Com.CreationalPatterns.AbstractFactoryPattern.problem.material;

import Com.CreationalPatterns.AbstractFactoryPattern.problem.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
