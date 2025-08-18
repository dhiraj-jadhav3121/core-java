package Collection;

public class Product {
    public int id;
    public String name;
    public String category;
    public int price;
    public float Ratings;

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", Ratings="
                + Ratings + "]";
    }

    public Product(int id, String name, String category, int price, float ratings) {
        super();
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        Ratings = ratings;
    }


}
