package ss12_map_and_tree.exercise12.linke_dlist;

import ss12_map_and_tree.exercise12.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagerLinkedlist {
    private LinkedList<Product> productLinkedList;

    public ProductManagerLinkedlist() {
        productLinkedList = new LinkedList<>();
    }

    public void addProduct(Product product) {
        productLinkedList.add(product);
    }

    public boolean deleteProduct(Product product) {
        return productLinkedList.remove(product);
    }

    public Product deleteProduct(int index) {
        return productLinkedList.remove(index);
    }

    public Product editProduct(int index,Product product) {
        return productLinkedList.set(index, product);
    }

    public void displayProduct() {
        for (Product product : productLinkedList) {
            System.out.println(product);
        }
    }

    public void searchProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product's name : ");
        String string = input.nextLine();
        int count = 0;
        System.out.println("--------------Product List");
        for (Product product : productLinkedList) {
            if (product.getName().equals(string)) {
                System.out.println(product);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No products found");
        }
    }

    public void sortDescendingByPrice() {
        Collections.sort(productLinkedList, new sortDescendingByPrice());
        displayProduct();
    }

    public void sortAscendingByPrice() {
        Collections.sort(productLinkedList, new sortAscendingByPrice());
        displayProduct();
    }

    public static class sortDescendingByPrice implements Comparator<Product> {
        public int compare(Product p1, Product p2) {
            if (p1.getPrice() < p2.getPrice()) {
                return 1;
            }
            return -1;
        }
    }

    public static class sortAscendingByPrice implements Comparator<Product> {
        public int compare(Product p1, Product p2) {
            if (p1.getPrice() > p2.getPrice()) {
                return 1;
            }
            return -1;
        }
    }
}
