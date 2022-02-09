package Model;

import Enums.Brand;
import Enums.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Store store;
    Admin Johnny;
    Customer Loveth;
    Product phone1;
    Product chair1;
    Product watch1;
    Product chair2;

    @Before
    public void setUp() throws Exception {
        //System.out.println("welcome");
        store = new Store();
        //Cart cart = new Cart();
        Johnny = new Admin("Johnny",01);
        Loveth = new Customer("Loveth",02,5_000_000.00);
        phone1 = new Product("Note 10",03, Brand.SAMSUNG, Category.ELECTRONICS,300_000.00,10);
        chair1 = new Product ("Gucci Chair",04, Brand.GUCCI, Category.FURNITURE,50_000,10);
        chair2 = new Product ("Gucci Chair 2",05, Brand.GUCCI, Category.FURNITURE,50_000,10);
        watch1 = new Product ("Swatch watch",06, Brand.SWATCH, Category.ACCESSORIES,10_000,10);
        Johnny.addProductToStore(phone1,store);
        //System.out.println(store.getProductList());
        Johnny.addProductToStore(chair1,store);
        Johnny.addProductToStore(watch1,store);
        //System.out.println(store.getProductList());
        //Johnny.removeProductFromStore(04,store);
        // System.out.println(store.getProductList());
        //Johnny.removeProductFromStore(07,store);
        //System.out.println(store.getProductList());
        //Johnny.viewProductInStore(05,store);
        Loveth.addProductToCart(watch1.getId(),5,store);
//        System.out.println(Loveth.getCart());
//        Loveth.addProductToCart(chair1.getId(),8,store);
//        System.out.println(Loveth.getCart());
//        Loveth.removeProductFromCart(watch1.getId(),5,store);
//        Loveth.removeProductFromCart(chair1.getId(),8,store);
        System.out.println(Loveth.getCart());
//        Loveth.removeProductFromCart(chair1.getId(),2,store);
//        System.out.println(Loveth.getCart());
        Loveth.viewProducts(store);
        Loveth.viewProductsByCategory(Category.FURNITURE, store);
        Loveth.checkout(store);
    }

    @Test
    public void addProductToCart() {
//        Loveth.addProductToCart(watch1.getId(),2,store);
//        Loveth.addProductToCart(chair1.getId(),2,store);
        assertEquals(Loveth.getCart().size(),2);
    }

    @Test
    public void removeProductFromCart() {
//        //Loveth.removeProductFromCart(watch1.getId(),2,store);
//        Loveth.removeProductFromCart(watch1.getId(),5,store);
//        Loveth.removeProductFromCart(chair1.getId(),8,store);
//
        assertEquals(Loveth.getCart().size(),0);
    }

    @Test
    public void viewProducts() {
        assertEquals(Loveth.getCart().size(),1);
    }

    @Test
    public void viewProductsByCategory() {

    }

    @Test
    public void checkout() {
        assertEquals(Loveth.getCart().size(),0);
        assertEquals(store.account,watch1.getPrice() * watch1.getQuantity(),0.00001);
    }

    @Test
    public void printReceipt() {
    }
}