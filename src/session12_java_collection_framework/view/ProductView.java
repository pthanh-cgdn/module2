package session12_java_collection_framework.view;

import mvc.models.Student;
import session12_java_collection_framework.models.Product;

import java.util.Scanner;

public class ProductView {
    public int view() {
        System.out.println("--------Product View--------");
        System.out.println("1. Add product");
        System.out.println("2. Edit product");
        System.out.println("3. Delete product");
        System.out.println("4. Display all product");
        System.out.println("0. End program");
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            try{
                System.out.println("Input your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch(NumberFormatException e){
                System.out.println("Please enter a number");
            }
        } while (choice <0 || choice >5);
        return choice;
    }

    public Product viewAdd() {
        Scanner scanner = new Scanner(System.in);
        int productId=-1;
        do {
            try {
                System.out.println("Please enter product id: ");
                productId = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        } while(productId < 0);
        System.out.println("Please enter product name: ");
        String productName = scanner.nextLine();
        System.out.println("Please enter product price: ");
        double productPrice = Double.parseDouble(scanner.nextLine());
        return new Product(productId, productName, productPrice);
    }

    public void viewMessage(boolean result) {
        if (result) {
            System.out.println("Your command is implemented successfully!");
        } else {
            System.out.println("Your command is failed to implemented!");
        }
    }

    public int viewDelelte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product id you want to delete: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public boolean confirmDelete(Product product) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please comfirm that you want to delete product: Id = "+product.getId()+" Name: "+product.getName()+" Price: "+product.getPrice());
        System.out.println("Enter your choice: Y for yes or N for no: ");
        return scanner.nextLine().equals("Y");
    }

    public void viewDisplay(String display) {
        System.out.println(display);
    }

    public int viewEdit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product id you want to edit: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public boolean confirmEdit(Product product) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please comfirm that you want to edit product: Id = "+product.getId()+" Name: "+product.getName()+" Price: "+product.getPrice());
        System.out.println("Enter your choice: Y for yes or N for no: ");
        return scanner.nextLine().equals("Y");
    }

    public void viewMessageNotFound(int productId) {
        System.out.println("Dont exist product with id: "+productId);
    }
    public Product viewEdit(Product product) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edit code: current id: "+product.getId());
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name: current name: "+product.getName());
        String name = scanner.nextLine();
        System.out.println("Input price: current price: "+product.getPrice());
        double price = Double.parseDouble(scanner.nextLine());
        return new Product(id, name, price);
    }
}
