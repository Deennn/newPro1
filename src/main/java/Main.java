import Enums.Brand;
import Enums.Category;
import Model.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //System.out.println("welcome");
        Store store;
        Admin Johnny;
        Customer Loveth;
        Product phone1;
        Product chair1;
        Product watch1;
        Product chair2;


        Company company = new Company("JohnnyAndCo","Edo Tech Park");
        Store store1 = new Store("JohnnyAccesories");
        Store store2 = new Store("Clothing");

        company.getStores().add(store1);
        company.getStores().add(store2);





//        store = new Store();
//        readMission();
//        Cart cart = new Cart();
        Johnny = new Admin("Johnny",01);
        Loveth = new Customer("Loveth",02,5_000_000.00);
        phone1 = new Product("Note 10",03, Brand.SAMSUNG, Category.ELECTRONICS,300_000.00,10);
        chair1 = new Product ("Gucci Chair",04, Brand.GUCCI, Category.FURNITURE,50_000,10);
        chair2 = new Product ("Gucci Chair 2",05, Brand.GUCCI, Category.FURNITURE,50_000,10);
        watch1 = new Product ("Swatch watch",06, Brand.SWATCH, Category.ACCESSORIES,10_000,10);
//        Johnny.addProductToStore(phone1,store);
//        //System.out.println(store.getProductList());
//        Johnny.addProductToStore(chair1,store);
//        Johnny.addProductToStore(watch1,store);
//        //System.out.println(store.getProductList());
//        //Johnny.removeProductFromStore(04,store);
//        // System.out.println(store.getProductList());
//        //Johnny.removeProductFromStore(07,store);
//        //System.out.println(store.getProductList());
//        //Johnny.viewProductInStore(05,store);
//        Loveth.addProductToCart(watch1.getId(),5,store);
////        System.out.println(Loveth.getCart());
//        Loveth.addProductToCart(chair1.getId(),1,store);
////        System.out.println(Loveth.getCart());
////        Loveth.removeProductFromCart(watch1.getId(),5,store);
////        Loveth.removeProductFromCart(chair1.getId(),8,store);
//        System.out.println(Loveth.getCart());
////        Loveth.removeProductFromCart(chair1.getId(),2,store);
////        System.out.println(Loveth.getCart());
//        Loveth.viewProducts(store);
//        Loveth.viewProductsByCategory(Category.FURNITURE, store);
//        Loveth.checkout(store);
    }


}
