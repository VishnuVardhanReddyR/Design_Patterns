package Com.CreationalPatterns.AbstractFactoryPattern.Implementation.material;

import Com.CreationalPatterns.AbstractFactoryPattern.Implementation.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
