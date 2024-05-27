package session12_java_collection_framework.controller;

import session12_java_collection_framework.models.Product;
import session12_java_collection_framework.services.impl.ProductManager;
import session12_java_collection_framework.view.ProductView;

public class MainController {
    public static void main(String[] args) {

        ProductView productView = new ProductView();
        ProductManager productManager = new ProductManager();
        int productId;
        boolean confirm = false;
        String display = "";
        while (true) {
            int choice = productView.view();
            switch (choice) {
                case 1:
                    Product product = productView.viewAdd();
                    boolean result = productManager.add(product);
                    if (result) {
                        productView.viewMessage(result);
                    }
                    break;
                case 2:
                    productId = productView.viewEdit();
                    product = productManager.contains(productId);
                    if(product != null){
                        confirm = productView.confirmEdit(product);
                    } else {
                        productView.viewMessageNotFound(productId);
                    };
                    if(confirm){
                        product = productView.viewEdit(product);
                        productManager.remove(productManager.contains(productId));
                        result = productManager.add(product);
                        if(!result){
                            productManager.add(productManager.contains(productId));
                        }
                        productView.viewMessage(result);
                    }
                    break;
                case 3:
                    productId = productView.viewDelelte();
                    Product checkProductId = productManager.contains(productId);
                    if (checkProductId != null) {
                        confirm = productView.confirmDelete(checkProductId);
                    } else {
                        productView.viewMessageNotFound(productId);
                    }
                    if(confirm){
                        productManager.remove(checkProductId);
                        productView.viewMessage(true);
                    }
                    break;
                case 4:

                    display = productManager.display();
                    productView.viewDisplay(display);
                    break;
                case 0:
                    return;
            }
        }
    }
}
