import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"Audi A-7",45000f));
        productsList.add(new Product(2,"Volvo xc-90",60000f));
        productsList.add(new Product(3,"Skoda",23000f));
        productsList.add(new Product(4,"Opel",18000f));
        productsList.add(new Product(5,"Ford",20000f));
        productsList.add(new Product(5,"BMW",90000f));

        List<Float> productPriceList =productsList.stream()
                .filter(p -> p.price > 30000)
                .map(p->p.price)
                .collect(Collectors.toList());
        System.out.println(productPriceList);
        productsList.stream()
                .filter(product -> product.price >= 30000)
                .forEach(product -> System.out.println(product.name));

    }
}