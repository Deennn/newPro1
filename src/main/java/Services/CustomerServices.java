package Services;

//import Model.Cart;
import Model.Product;
import Model.Store;

import java.util.List;

public interface CustomerServices {
    void addProductToCart(Product product, Store store, List<Product> cart);
    void removeProductFromCart (Product product, Store store, Cart cart);
    void viewProduct(int productId, Store store);
    void viewProducts(int productId, Store store);
}
