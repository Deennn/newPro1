package Model;

import java.util.ArrayList;
import java.util.List;

public class Store {

    double account;

    List<Product> productList;

    public Store() {
        this.productList = new ArrayList<>();
        this.account = 0.00;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Store{" +
                "productList=" + productList +
                '}';
    }
}
