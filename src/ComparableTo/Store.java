package ComparableTo;

import java.util.*;


public class Store {

    private List<Product> products = new ArrayList<>();
    private Map<String, Double> sumProducts = new TreeMap<>();

    public Store(Product product) {
        products.add(product);
    }

    public Product getProducts(int i) {
        return products.get(i);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products.add(products);
    }

    public void remove(int i) {
        products.remove(i);
    }

    public Map<String, Double> getSumProducts() {
        return sumProducts;
    }

    public int sumQuantity(int i) {

        return getProducts().stream().filter(x -> x.getName().equalsIgnoreCase(getProducts(i).getName())).mapToInt(x -> x.getQuantity()).sum();

    }

    public void setSumProducts(int i) {

        List<Product> newList = getProducts();

        if (!getSumProducts().containsKey(newList.get(i).getName())) {
            sumProducts.put(newList.get(i).getName(), newList.stream().filter(x -> x.getName().equalsIgnoreCase(getProducts(i).getName())).mapToDouble(x -> x.Total()).sum());

        }

    }

}
