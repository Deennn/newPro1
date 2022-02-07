package Services;

//import Model.Cart;
import Enums.Category;
import Model.Product;
import Model.Store;

import java.util.List;

public interface CustomerServices {
    void addProductToCart(int productId, int quantity, Store store);
    void removeProductFromCart (int productId, int quantity, Store store);
    void viewProducts(Store store);
    void viewProductsByCategory(Category category, Store store);
    void checkout(Store store);
    void printReceipt(String data,String name,int time);
}
