package ComparableTo;

import java.awt.font.FontRenderContext;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class program {


    public static void main(String[] args) {

        List<Product> lista = new ArrayList<>();
        Map<String, DoubleStream> map = new HashMap<>();


        Product product;
        Store store;

        product = new Product("Sabonete", 5.00, 2);
        store = new Store(product);
        product = new Product("Pera", 5.00, 2);
        store.setProducts(product);
        product = new Product("Bolacha", 5.00, 2);
        store.setProducts(product);
        product = new Product("Sabonete", 5.00, 1);
        store.setProducts(product);
        product = new Product("Pera", 5.00, 1);
        store.setProducts(product);
        product = new Product("Bolacha", 5.00, 1);
        store.setProducts(product);
        product = new Product("Sabonete", 5.00, 1);
        store.setProducts(product);
        product = new Product("Banana", 5.00, 5);
        store.setProducts(product);




        for (int i = 0; i < store.getProducts().size(); i++) {
            store.setSumProducts(i);
        }

        System.out.println("All products insered:");
        System.out.println("=============================");
        store.getProducts().forEach(x -> System.out.println("Product: " + x.getName() + " - R$ " + x.getPrice() + " - Qtd.: " + x.getQuantity()));

        System.out.println("\n\n=============================");
        System.out.println("Sum total for type of product");
        System.out.println("=============================");

        store.getSumProducts().forEach((k, v) -> System.out.println("Product: " + k + " - R$ " + v));
        Set<String> set = new HashSet<>();


    }
}
