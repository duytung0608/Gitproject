package ss12_map_and_tree.exercise12;

public class Product {
    private String name;
    private String identification;
    private double price;

    public Product() {
    }

    public Product(String name, String identification, double price) {
        this.name = name;
        this.identification = identification;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return this.identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Product's name = "
                + this.name
                + " and id = "
                + this.identification
                + " and price = "
                + this.price;
    }


}
