package Assignment5;

import java.util.ArrayList;

public class Controller {
    ArrayList<Product> productList = new ArrayList<>();
    public void createProduct(int id, String name, double price, int quantity) {
        Product product = new Product(id, name, price, quantity);
        productList.add(product);
    }

    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)){
                return product;
            }
            else {
                System.out.println("Product with name : " + name + " not available ! ! !");
            }
        }
        return null;
    }

    public Product getProductInRange(double min, double max){
        for (Product product : productList) {
            if (product.getPrice() >= min && product.getPrice() <= max){
                return product;
            }
            else {
                System.out.println("Products are not available in given range ! ! !");
            }
        }
        return null;
    }

    public String getAllProduct(){
        return productList.toString();
    }
}
