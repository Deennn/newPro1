package Model;

import Enums.Category;
import Services.CustomerServices;

import java.io.FileWriter;
import java.io.Writer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Customer extends Person implements CustomerServices {
    int id;
    private double wallet;
    Map<Product, Integer> cart;

    public Customer(String name, int id, double wallet) {
        super(name);
        this.id = id;
        this.wallet = wallet;
        this.cart = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public double getWallet() {
        return wallet;
    }

    public Map<Product, Integer> getCart() {
        return cart;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void setCart(Map<Product, Integer> cart) {
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
    public void addProductToCart(int productId, int quantity, Store store) {
        List<Product> list = store.getProductList();
        Product product = null;

        for (Product value : list) {
            if (value.getId() == productId) {
                product = value;
                break;
            }
        }
        if (product != null) {
            this.cart.put(product, quantity);
            //setCart(cart);
            System.out.println("--------------------------------------------------------------" + product.getName() + " has been added to Cart successfully ----------------------------------------------------------------------------");
        } else {
            System.out.println("--------------------------------------------------------------" + " Product does not exist in Store" + "--------------------------------------------------------------------------");
        }
    }

    @Override
    public void removeProductFromCart(int productId, int quantity, Store store) {
        List<Product> list = store.getProductList();
        Product product = null;

        for (Product value : list) {
            if (value.getId() == productId) {
                product = value;
                break;
            }
        }

        if (product != null) {
            for (int i = 0; i < this.cart.size(); i++) {
                if (this.cart.containsKey(product)) {
                    int initialQuantity = this.cart.get(product) - quantity;
//                    initialQuantity-= quantity;
                    this.cart.put(product, initialQuantity);
                }
            }
            System.out.println("-----------" + product.getName() + " has been removed from Cart successfully ------------------");
        } else {
            System.out.println("--------------------------" + " Product does not exist in Cart" + "----------------------------");
        }
    }

    @Override
    public void viewProducts(Store store) {
        List<Product> list = store.getProductList();
        for (Product item : list) {
            System.out.println(item.toString());
        }
        System.out.println("---------------------" + this.getName() + " has viewed all products in Store-------------");

    }

    @Override
    public void viewProductsByCategory(Category category, Store store) {
        List<Product> list = store.getProductList();
        for (Product item : list) {
            if (item.getCategories() == category) {
                System.out.println(item);
            }
        }
        System.out.println("---------------------" + this.getName() + " has viewed all products by category in Store-------------");
    }

    @Override
    public void checkout(Store store) {
        List<Product> list = store.getProductList();
        double totalAmount = 0.00;
        Set<Product> listOfProducts = this.cart.keySet();
        for (Product product : listOfProducts) {
            int initialQuantity = this.cart.get(product);
            totalAmount = product.getPrice() * initialQuantity;

            for (Product product1 : list) {
                if (product1 == product) {
                    product1.setQuantity((int) (product1.getQuantity() - initialQuantity));
                }
            }
        }
        if (this.wallet >= totalAmount) {
            this.wallet -= totalAmount;

            StringBuilder data = new StringBuilder();
            data.append(LocalDate.now()).append("\n");
            data.append("name = ").append(this.getName()).append("\n");
            for(Map.Entry<Product, Integer> item: this.cart.entrySet()){
                data.append(item.getKey().getName()).append(" = ").append("Price : ").append(item.getKey().getPrice()).append(",  Quantity : ").append(item.getValue()).append(", Category : ").append(item.getKey().getCategories() + "\n");
            }
            data.append("Total Amount = ").append(totalAmount).append("\n").append("Success ");
            this.printReceipt(String.valueOf(data),this.getName(),LocalDateTime.now().getSecond());
            System.out.println("----------------- Products have been purchased!!! ---------------");

        } else {
            System.out.println("----------------- Insufficient Funds!!! HUSTLE HARDER!!! ---------------");
        }
    }

    @Override
    public void printReceipt(String data,String name,int time) {


        try {
            // Creates a Writer using FileWriter
            String fileName = "Receipt"+"_"+name+"_"+time+".txt";
            Writer output = new FileWriter("/Users/decagon/IdeaProjects/Decagon/JohnnyAndCoStores/src/main/resources/"+fileName);

            output.write(data);

            // Closes the writer
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
