package Com.CreationalPatterns.FactoryMethodPattern.Implementation.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine{

    @Override
    public String render(String viewName, Map<String, Object> object) {
        return "view is rendered by MatchaViewEngine";
    }
}
