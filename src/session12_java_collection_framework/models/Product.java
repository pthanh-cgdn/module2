package session12_java_collection_framework.models;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;

    public Product() {

    }

    public Product(int id, String name, double price) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Product product) {
        if (this.getPrice() > product.getPrice()) {
            return 1;
        } else if (this.getPrice() == product.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
