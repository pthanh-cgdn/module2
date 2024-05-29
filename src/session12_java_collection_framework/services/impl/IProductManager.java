package session12_java_collection_framework.services.impl;

import session12_java_collection_framework.models.Product;

import java.util.List;

public interface IProductManager {
    boolean add(Product product);

    void remove(Product product);

    String display();

    Product contains(int productId);

    List<Product> sortByPrice(List<Product> products);
}
