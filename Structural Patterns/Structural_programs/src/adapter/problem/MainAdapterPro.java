package adapter.problem;

import adapter.problem.avaFilters.Caramel;

public class MainAdapterPro {
    public static void main(String[] args){
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
       // imageView.apply(new Caramel()); // compilation error
        // we have compilation error here. Because the interface of the caramel class does not match what the apply method expects.
        // So, our appy method expects an instance of a class that implements our Filter interface.
        // So, this filter instance says that we should have a method called apply.
        // however the caramel class does not implement the filter interface, and it doesn't have an apply method.
        // This is where we use the adapter pattern.
        // With the adapter pattern we convert the interface of the caramel class to different form that matches what we need.
    }
}
