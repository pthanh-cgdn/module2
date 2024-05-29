package session12_java_collection_framework.services.impl;

import session12_java_collection_framework.models.Product;
import session12_java_collection_framework.repositories.ProductRepository;

import java.util.Collections;
import java.util.List;

public class ProductManager implements IProductManager {
    ProductRepository productRepository = new ProductRepository();
    @Override
    public boolean add(Product product) {
        if(product.getName().equals("")) {
            return false;
        }
        if(product.getId() <0 || product.getId()>1000000) {
            return false;
        }
        productRepository.add(product);
        return true;
    }

    @Override
    public Product contains(int productId) {
        return productRepository.contains(productId);
    }

    @Override
    public List<Product> sortByPrice(List<Product> products) {
        Collections.sort(products);
        return products;
    }

    @Override
    public String display() {
        String str="";
        for (Product product : sortByPrice(productRepository.getAll()))
            str += "id: " + product.getId() + ", name: " + product.getName() + ", price: " + product.getPrice() + "\n";
        return str;
    }

    @Override
    public void remove(Product product){
        productRepository.remove(product);
    }
}
