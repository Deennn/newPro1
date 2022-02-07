package Model;

import Services.AdminServices;

import java.util.List;

public class Admin extends Person implements AdminServices {

    private int id;


    public Admin(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                '}';
    }

    @Override
    public void addProductToStore(Product product, Store store) {
        List <Product> list = store.getProductList();
        list.add(product);
        store.setProductList(list);
        System.out.println("--------------------------------------" + product.getName() + " has been added to Store successfully-------");
    }

    @Override
    public void removeProductFromStore( int id, Store store) {
        List <Product> list = store.getProductList();
        int proId = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                proId = i;
                break;
            }
        }
        if(proId != 0) {
            Product product = list.get(proId);
            list.remove(product);
            store.setProductList(list);
            System.out.println("---------------------------------------" + product.getName() + " has been removed from Store successfully-----");
        }else{
            System.out.println("---------------------------------------" + " Product does not exist in Store " + "-----");
        }


    }

    @Override
    public void viewProductInStore(int id, Store store) {
        List <Product> list = store.getProductList();
        int proId = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                proId = i;
                break;
            }
        }
        if(proId != 0) {
            Product product = list.get(proId);
            System.out.println(product);
            System.out.println("----------------------------------" + product.getName() + " can be viewed in Store--------------------------------------------------------------------------");
        }else{
            System.out.println("----------------------------------" + " Product does not exist in Store" + "--------------------------------------------------------------------------");
        }
    }

    /*@Override
    public void addProductToCart(Product product, Store store, Cart cart) {

    }

    @Override
    public void removeProductFromCart(Product product, Store store, Cart cart) {

    }*/
}
