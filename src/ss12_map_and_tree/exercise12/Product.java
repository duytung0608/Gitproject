package ss12_map_and_tree.exercise12;

public class Product {
    private String name;
    private int identification;
    private double price;

    public Product() {
    }

    public Product(String name, int identification, double price) {
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

    public int getIdentification() {
        return this.identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
