package ss12_map_and_tree.exercise12;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.awt.*;
import java.util.*;

public class ProductManager {
    private ArrayList<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {

        if(productList.size() == 0) {
            productList.add(0, product);
        } else {
            productList.add(productList.size(), product);
        }
    }

    public void repairProduct(int index, Product product) {
        productList.remove(index);
        productList.add(index, product);
    }

    public Product removeProduct(int index) {
        return productList.remove(index);
    }

    public void displayProduct() {
        while (!productList.isEmpty()) {
            System.out.println(productList.remove(0) + "\t");
        }
    }

    public void findProduct(String name) {
        int count = 0;
        System.out.println("-------------Product List");
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                System.out.println(product);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No products found");
        }
    }

    public void sortAscendingByPrice() {
        Collections.sort(productList, new sortAscendingByPrice());
        displayProduct();
    }

    public void sortDescendingByPrice() {
        Collections.sort(productList, new sortDescendingByPrice());
        displayProduct();
    }

    public static class sortAscendingByPrice implements Comparator<Product> {
        public int compare(Product p1, Product p2) {
            if (p1.getPrice() > p2.getPrice()) {
                return 1;
            }
            return -1;
        }
    }

    public static class sortDescendingByPrice implements Comparator<Product> {
        public int compare(Product p1, Product p2) {
            if (p1.getPrice() < p2.getPrice()) {
                return 1;
            }
            return -1;
        }
    }



}
