package Invoice;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ProductManager
        ProductManager productManager = new ProductManager();
        Scanner sc=new Scanner(System.in);

        // Create products
        productManager.createProduct();
        productManager.createProduct();
//        productManager.createProduct();

        // Display list of products in the product manager
        System.out.println("Products in ProductManager:");
        for (Product product : productManager.getProducts()) {
            System.out.println(product.getName() + " - Quantity: " + product.getQuantity());
        }


        Cart cart = new Cart();

        cart.setProducts(productManager.getProducts());
        char op;
        do{
        System.out.println("Enter 1 for adding product into Cart");
        System.out.println("Enter 2 for removing product from Cart");

        int choice =sc.nextInt();

        switch (choice){
            case 1: // Add products to the cart

                cart.addProduct(productManager.getProducts());
                cart.addProduct(productManager.getProducts());
                // Display the list of products in the cart
                System.out.println("Products in Cart:");
                for (Product product : cart.getProducts()) {
                    System.out.println(product.getName() + " - Quantity: " + product.getQuantity());
                }
                break;

            case 2: //Remove Product from cart
                System.out.println("Enter Product name : ");
                String prod=sc.nextLine();

                for (Product product : cart.getProducts()){
                    if(Objects.equals(product.getName(), prod)){
                        cart.removeProduct(product);
                        break;
                    }
                }

                // Display the updated list of products in the cart
                System.out.println("Products in Cart after removal:");
                for (Product product : cart.getProducts()) {
                    System.out.println(product.getName() + " - Quantity: " + product.getQuantity());
                }
                break;
            default:
                System.out.println("Invalid Input!!");
                break;
        }
        System.out.println("Do you want to continue ? ? ?  Y/N");
        while (true) {
            op = sc.next().charAt(0);
            if ((op == 'Y') || (op == 'y') || (op == 'N') || (op == 'n'))
                break;
            else
                System.out.println("Enter Y for yes or N for no ! ! !");
        }
    }while(op == 'y' || op == 'Y');


        // Generate
        cart.generateInvoice();
    }
}

