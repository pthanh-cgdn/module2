package session12_java_collection_framework.services.impl;

import session12_java_collection_framework.models.Product;
import session12_java_collection_framework.repositories.ProductRepository;

import java.util.Arrays;

public class ProductManager implements IProductManager {
    ProductRepository productRepository = new ProductRepository();
    @Override
    public boolean add(Product product) {
        return productRepository.add(product);
    }

    @Override
    public Product contains(int productId) {
        return productRepository.contains(productId);
    }

    @Override
    public Product[] sortByPrice(Product[] products) {
        Arrays.sort(products);
        return products;
    }

    @Override
    public String display() {
        String str="";
        for (Product product : sortByPrice(productRepository.getProduct()))
            str += "id: " + product.getId() + ", name: " + product.getName() + ", price: " + product.getPrice() + "\n";
        return str;
    }

    @Override
    public void remove(Product product){
        productRepository.remove(product);
    }
}
