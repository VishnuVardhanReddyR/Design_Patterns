package Com.CreationalPatterns.FactoryMethodPattern.problem;

import Com.CreationalPatterns.FactoryMethodPattern.problem.matcha.Controller;
import Com.CreationalPatterns.FactoryMethodPattern.problem.matcha.MatchaViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProducts(){
        // Get products from a database.
        Map<String, Object> context = new HashMap<>();
        // context.put(products)
        render("products.html", context, new MatchaViewEngine());
    }
}
