package Collection;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Display {
    public static void main(String[] args) {

        ArrayList<Product> pd = Stream.of(
                new Product(45, "Headphones", "tech", 7000, 2.5f),
                new Product(18, "cloths", "non-tech", 700, 2.45f),
                new Product(21, "skinCare", "non-tech", 70, 1.25f),
                new Product(43, "earbuds", "tech", 560, 1.5f),
                new Product(33, "laptops", "tech", 70000, 2.35f),
                new Product(4, "mobile", "tech", 32000, 2.5f),
                new Product(5, "books", "non-tech", 300, 4.5f),
                new Product(425, "pendrive", "tech", 800, 4.5f),
                new Product(12, "watch", "tech", 9000, 3.5f),
                new Product(32, "hairband", "non-tech", 90, 2.5f)
        ).collect(Collectors.toCollection(ArrayList::new));


        System.out.println("1. All products from Tech category");
        for (int i = 0; i < pd.size(); i++) {
            if (pd.get(i).category.equalsIgnoreCase("tech")) {
                System.out.println(pd.get(i).name);

            }

        }
        System.out.println("\n2. Display price of all clothes...");
        for (int i = 0; i < pd.size(); i++) {

            if (pd.get(i).name.equalsIgnoreCase("cloths")) {
                System.out.println(pd.get(i).price);
            }
        }
        System.out.println("\n 3.Count number of products which are from kids category.");

    }
}
