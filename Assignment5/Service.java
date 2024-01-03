package Assignment5;

import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);
        char ch;
        int id;
        String name;
        double price;
        int quantity;
        do {
            System.out.println("Enter product id : ");
            id = sc.nextInt();
            System.out.println("Enter product name : ");
            name = sc.next();
            System.out.println("Enter product price : ");
            price = sc.nextDouble();
            System.out.println("Enter product quantity : ");
            quantity = sc.nextInt();
            controller.createProduct(id, name, price, quantity);
            System.out.println("Do you want to add more products ?");
            ch = sc.next().charAt(0);
        }while (ch == 'y' || ch == 'Y');

        System.out.println(controller.getAllProduct());

        System.out.println("Enter minimum and maximum price range of product : ");
        System.out.println(controller.getProductInRange(sc.nextDouble(), sc.nextDouble()));

        //System.out.println("Enter product name to be searched : ");
        //System.out.println(controller.getProduct(sc.next()));

    }
}
