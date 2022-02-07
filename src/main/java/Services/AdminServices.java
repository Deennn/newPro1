package Services;

import Model.Product;
import Model.Store;

public interface AdminServices {
    void addProductToStore(Product product, Store store);
    void removeProductFromStore(int id, Store store);
    void viewProductInStore(int id, Store store);
}
