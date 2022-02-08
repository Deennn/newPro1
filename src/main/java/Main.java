import Enums.Brand;
import Enums.Category;
import Model.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("welcome");
        Store store = new Store();
        //store.displayMissionTxt();
        //Cart cart = new Cart();
        Admin Johnny = new Admin("Johnny",01);
        Customer Loveth = new Customer("Loveth",02,5_000_000.00);
        Product phone1 = new Product("Note 10",03, Brand.SAMSUNG, Category.ELECTRONICS,300_000.00,10);
        Product chair1 = new Product ("Gucci Chair",04, Brand.GUCCI, Category.FURNITURE,50_000,10);
        Product chair2 = new Product ("Gucci Chair 2",05, Brand.GUCCI, Category.FURNITURE,50_000,10);
        Product watch1 = new Product ("Swatch watch",06, Brand.SWATCH, Category.ACCESSORIES,10_000,10);
        Johnny.addProductToStore(phone1,store);
        Johnny.addProductToStore(watch1,store);
        //Johnny.removeProductFromStore(phone1.getId(),store);
        Loveth.addProductToCart(06,1,store);
        Loveth.removeProductFromCart(06,1,store);
        //Johnny.viewProductInStore(03,store);
    }
}
