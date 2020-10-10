package adapter.implementation;

import adapter.implementation.avaFilters.Caramel;

public class MainAdapterImp {
    public static void main(String[] args){
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));

    }
}
