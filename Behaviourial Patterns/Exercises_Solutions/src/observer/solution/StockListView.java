package observer.solution;

import java.util.ArrayList;
import java.util.List;

public class StockListView {
    private Stock stock;
    private List<Stock> stocks = new ArrayList<>();

    public StockListView(Stock stock) {
        this.stock = stock;
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }
}
