package Com.CreationalPatterns.FactoryMethodPattern.Implementation.sharp;

import Com.CreationalPatterns.FactoryMethodPattern.Implementation.matcha.Controller;
import Com.CreationalPatterns.FactoryMethodPattern.Implementation.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
