package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Store {

    double account;
    private String storeName;

    List<Product> productList;

    public Store(String storeName) {
        this.storeName = storeName;
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
    public static void readMission() throws IOException {
        String filePath = "/Users/user/Desktop/E-commerce/JohnnyAndCoClothing/src/main/resources/mission.txt";
        String lineOfMission;

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((lineOfMission = reader.readLine()) != null) {
            System.out.println(lineOfMission);
        }
        reader.close();
    }
}
