package ss12_map_and_tree.exercise12;

public class TestProduct {
    public static void main(String[] args) {
        ProductManager productManagers = new ProductManager();

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

}
