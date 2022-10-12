package ss12_map_and_tree.exercise12;

import ss12_map_and_tree.exercise12.array_list.ProductManagerArraylist;
import ss12_map_and_tree.exercise12.linke_dlist.ProductManagerLinkedlist;

public class TestProduct {
    public static void arrayProduct() {
        ProductManagerArraylist productManagers = new ProductManagerArraylist();

        Product p1 = new Product("Iphone7", "197j0", 119);
        Product p2 = new Product("lenov pro", "16h50", 999);
        Product p3 = new Product("Iphone 13", "97k0", 666);
        Product p4 = new Product("Samsung Galaxy s21 utra", "197h0", 780);

        productManagers.addProduct(p1);
        productManagers.addProduct(p2);
        productManagers.addProduct(p3);
        productManagers.addProduct(p4);
        productManagers.addProduct(p1);

        productManagers.repairProduct(2, p1);

//        System.out.println(productManagers.productList.size());
//        System.out.println(productManagers.removeProduct(4));
//        System.out.println(productManagers.productList.size());
//        System.out.println(productManagers.productList.remove(3));

//        productManagers.displayProduct();

//        productManagers.findProduct("lenov pro");

        productManagers.sortDescendingByPrice();
    }


    public static void linkedlistProduct() {
        ProductManagerLinkedlist product = new ProductManagerLinkedlist();

        Product p1 = new Product("Iphonce7", "197j0", 119);
        Product p2 = new Product("lenkov pro", "16h50", 999);
        Product p3 = new Product("Iphone 13", "97k0", 666);
        Product p4 = new Product("Samsung Galaxy s21 utra", "197h0", 780);

        product.addProduct(p1);
        product.addProduct(p3);
        product.addProduct(p2);
        product.addProduct(p4);

        product.displayProduct();
        System.out.println("\n\n");
//        product.displayProduct();
//        product.searchProduct();
        product.sortAscendingByPrice();

    }

    public static void main(String[] args) {
//        arrayProduct();
        linkedlistProduct();
    }
}
