package Com.CreationalPatterns.FactoryMethodPattern.Implementation.sharp;

import Com.CreationalPatterns.FactoryMethodPattern.Implementation.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> object) {
        return "View rendered by Sharp";
    }
}
