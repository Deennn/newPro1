package Model;

import Services.CustomerServices;

import java.util.ArrayList;
import java.util.List;

public class Customer extends  Person implements CustomerServices {
    int id;
    private double wallet;
    List<Product> cart;

    public Customer(String name, int id, double wallet) {
        super(name);
        this.id = id;
        this.wallet = wallet;
        this.cart = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public double getWallet() {
        return wallet;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", wallet=" + wallet +
                ", cart=" + cart +
                '}';
    }

    @Override
    public void addProductToCart(Product product, Store store, List<Product> cart) {
        List<Product> list = store.getProductList();
        //List<Product> cartItemsList = cart.getCartItemsList();
        int proId = 0;
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i).getId() == product.getId()) {
               proId = i;
               break;
           }
        }
        if (!(proId == 0)){
            product = list.get(proId);
            cart.add(product);
            setCart(cart);
            System.out.println("--------------------------------------------------------------" + product.getName() + " has been added to Cart successfully ----------------------------------------------------------------------------");
        }else {
            System.out.println("--------------------------------------------------------------" + " Product does not exist in Store" + "--------------------------------------------------------------------------");
        }
    }

    @Override
    public void removeProductFromCart(Product product, Store store, Cart cart) {
        List<Product> cartItemsList = cart.getCartItemsList();
        int proId = 0;
        Product productTemp;
        for (int i = 0; i < cartItemsList.size(); i++) {
            if (cartItemsList.get(i).getId() == product.getId()) {
                proId = i;
                //productTemp = cartItemsList.get(i);
                break;
            }
        }
        if (!(proId == 0)){
            product = cartItemsList.get(proId);
            cartItemsList.remove(product);
            cart.setCartItemsList(cartItemsList);
            System.out.println("--------------------------------------------------------------" + product.getName() + " has been removed from Cart successfully ----------------------------------------------------------------------------");
        }else if (proId == 0 && cartItemsList.size() == 1){
            if (cartItemsList.get(0).getId() == product.getId()) {
                product = cartItemsList.get(proId);
                cartItemsList.remove(product);
                cart.setCartItemsList(cartItemsList);
                System.out.println("--------------------------------------------------------------" + product.getName() + " has been removed from Cart successfully ----------------------------------------------------------------------------");
            }
        }

        else {
            System.out.println("--------------------------------------------------------------" + " Product does not exist in Cart" + "--------------------------------------------------------------------------");
        }
    }

    @Override
    public void viewProduct(int productId, Store store) {

    }

    @Override
    public void viewProducts(int productId, Store store) {

    }
}
