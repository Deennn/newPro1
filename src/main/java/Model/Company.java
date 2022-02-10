package Model;

import java.util.ArrayList;
import java.util.List;

public class Company {
    String name;
    String address;
    List<Store> stores;

    public Company(String name, String address){
        this.name = name;
        this.address = address;
        this.stores = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }
}
