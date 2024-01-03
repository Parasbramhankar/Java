package Lab_7.ProductCollection;

import java.util.*;

public class ProductCreation {
    ArrayList<Product> product=new ArrayList<>();
    ArrayList<Double>pr=new ArrayList<>();
    public void createProduct(){
        Product P1=new Product();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Product detail: ");
        System.out.println("Enter Name of Product: ");
        String str=sc.nextLine();
        P1.setName(str);
        System.out.println("Enter Product Id: ");
        P1.setId(sc.nextInt());
        System.out.println("Enter Product Price ");
        P1.setPrice(sc.nextDouble());
        System.out.println("Enter Quantity ");
        P1.setQuantity(sc.nextInt());
        product.add(P1);
        System.out.println("New Product Added");
    }


    public void getProduct(String productName){

        for (Product list : product) {
            if(Objects.equals(list.getName(), productName)){
                System.out.println("Product name : " + list.getName());
                System.out.println("Product Id : " + list.getId());
                System.out.println("Product Price : " + list.getPrice());
                System.out.println("Product Quantity: "+list.getQuantity());

            }
        }
    }
//    The Objects.equals() method is a static method in the java.util.Objects class that was introduced in Java 7.
//    It is used to compare two objects for equality, and it returns a boolean value indicating whether the two objects
//    are equal or not.
 void createList() {
    for (Product p : product) {
        pr.add(p.getPrice());
    }
}

    void minimumPrice(){

        double p=pr.stream().min(Double::compare).get();
        System.out.println("Minimum Product: ");
        for (Product list:product) {
            if(list.getPrice()==p){
                System.out.println("Product name : " + list.getName());
                System.out.println("Product Id : " + list.getId());
                System.out.println("Product Price : " + list.getPrice());
                System.out.println("Product Quantity: "+list.getQuantity());

            }
        }
    }
    void maximumPrice(){

        double p=pr.stream().max(Double::compare).get();
        System.out.println("Maximum Product: ");
        for (Product list:product) {
            if(list.getPrice()==p){
                System.out.println("Product name : " + list.getName());
                System.out.println("Product Id : " + list.getId());
                System.out.println("Product Price : " + list.getPrice());
                System.out.println("Product Quantity: "+list.getQuantity());

            }
        }
    }

    void getAllProduct(double price1, double price2) {
        product.stream()
                .filter(p -> p.getPrice() >= price1 && p.getPrice() <= price2)
                .forEach(p -> {
                    System.out.println("Product name : " + p.getName());
                    System.out.println("Product Id : " + p.getId());
                    System.out.println("Product Price : " + p.getPrice());
                    System.out.println("Product Quantity: " + p.getQuantity());
                });
    }

}



