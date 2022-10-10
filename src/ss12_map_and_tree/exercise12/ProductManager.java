package ss12_map_and_tree.exercise12;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ProductManager<T> {
    private ArrayList<T> productList;

    public ProductManager() {
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void repairProduct(int index, Product product) {
        productList.add(index, product);
    }

    public T removeProduct(int index) {
        return productList.remove(index);
    }

    public void displayProduct() {
        while (!productList.isEmpty() &) {
            System.out.println(productList.remove(1));
        }
    }


    public static void main(String[] args) {
        ProductManager productManager = new ProductManager()
    }

}
