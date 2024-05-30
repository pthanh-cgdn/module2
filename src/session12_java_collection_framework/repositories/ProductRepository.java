package session12_java_collection_framework.repositories;

import session12_java_collection_framework.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public void add(Product product) {
        File file = new File("src/session12_java_collection_framework/repositories/data/product.csv");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(product.toString());
            bufferedWriter.newLine();

        } catch (IOException e) {
            System.out.println("Error writing to file");
        } finally {

                if (bufferedWriter != null) {
                    try {
                    bufferedWriter.close();
                    } catch (IOException e) {
                        System.out.println("Error closing file");
                    }
                }
        }

    }

    public Product contains(int productId) {

        File file = new File(("src/session12_java_collection_framework/repositories/data/product.csv"));
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Product> products = new ArrayList<>();
        String line = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                products.add(new Product(Integer.parseInt(data[0]),data[1],Double.parseDouble(data[2])));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch(IOException e) {
            System.out.println("Error reading file");
        } finally{
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Error closing file");
                }
            }
        }
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }

    public void remove(Product product) {
        ArrayList<Product> products = getAll();
        for (Product product1 : products) {
            if (product.getId() == product1.getId()) {
                products.remove(product1);
                break;
            }
        }

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src/session12_java_collection_framework/repositories/data/product.csv",false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Product temp:products) {
                bufferedWriter.write(temp.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file");
        } finally {

            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.out.println("Error closing file");
                }
            }
        }

    }

    public ArrayList<Product> getAll() {
        File file = new File(("src/session12_java_collection_framework/repositories/data/product.csv"));
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        ArrayList<Product> products = new ArrayList<>();
        String line = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                products.add(new Product(Integer.parseInt(data[0]),data[1],Double.parseDouble(data[2])));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch(IOException e) {
            System.out.println("Error reading file");
        } finally{
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Error closing file");
                }
            }
        }
        return products;
    }
    public void writeDataToType(String path, ArrayList<Product> products){
        try {
            FileOutputStream op = new FileOutputStream(path);
            ObjectOutputStream os = new ObjectOutputStream(op);
            os.writeObject(products);
            os.close();
            op.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error opening file");
        }
    }
    public ArrayList<Product> readDataFromFile(String path) {
        ArrayList<Product> products = null;
        try {
            FileInputStream in = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(in);
            products = (ArrayList<Product>) ois.readObject();
            in.close();
            ois.close();
        } catch (IOException e) {
            System.out.println("Error opening file");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        return products;
    }
}
