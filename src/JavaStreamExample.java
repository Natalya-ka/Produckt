import java.util.ArrayList;
import java.util.List;


public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"Audi A-7",45000f));
        productsList.add(new Product(2,"Volvo xc-90",60000f));
        productsList.add(new Product(3,"Skoda",23000f));
        productsList.add(new Product(4,"Opel",18000f));
        productsList.add(new Product(5,"Ford",20000f));
        productsList.add(new Product(5,"BMW",90000f));
        List<String>productNameList=new ArrayList<String>();
        List<Float> productPriceList = new ArrayList<Float>();
        for(Product product: productsList){

            if(product.price<30000){
                productPriceList.add(product.price);
                productNameList.add(product.name);
            }
        }
        System.out.println(productPriceList+"\n "+ productNameList);
    }
}