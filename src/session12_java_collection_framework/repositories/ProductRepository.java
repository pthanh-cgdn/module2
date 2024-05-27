package session12_java_collection_framework.repositories;

import session12_java_collection_framework.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> productList = new ArrayList<>();

    public boolean add(Product product) {
        return productList.add(product);
    }

    public Product contains(int productId) {
        for (Product product : productList) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }

    public void remove(Product product) {
        productList.remove(product);
    }

    public Product[] getProduct() {
        return productList.toArray(new Product[productList.size()]);
    }
}
