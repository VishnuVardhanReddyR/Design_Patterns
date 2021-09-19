package Com.CreationalPatterns.FactoryMethodPattern.Implementation.matcha;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName, Map<String, Object> object);
}
