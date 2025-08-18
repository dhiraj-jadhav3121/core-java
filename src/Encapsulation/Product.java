package Encapsulation;

public class Product {
    //productId, name, description, price, quantity, and category

    private int productId;
    private String name;
    private String description;
    private int price;
    private String category;

    public Product(int productId, String name, String description, int price, String category) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.setProductId(45);
        p.setName("Dhiraj");
         p.setCategory("it");
         p.setPrice(20000);
         p.setDescription("Product");
        System.out.println(p);

    }

}

