package session12_java_collection_framework.services.impl;

import session12_java_collection_framework.models.Product;

public interface IProductManager {
    boolean add(Product product);

    void remove(Product product);

//    void edit(Product product);
    String display();
    Product contains(int productId);

    Product[] sortByPrice(Product[] products);
}
