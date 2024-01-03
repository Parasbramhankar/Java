package Lab_7.ProductCollection;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductCreation PC = new ProductCreation();
        Scanner sc = new Scanner(System.in);
        PC.createProduct();
        PC.createProduct();

        System.out.println("Enter product name to print data: ");
        PC.getProduct(sc.nextLine());

        PC.createList();
//        Minimum price product
        PC.minimumPrice();
//        Maximum price product
        PC.maximumPrice();

        System.out.println("Enter Price Range : ");
        double price1=sc.nextDouble();
        double price2=sc.nextDouble();

        PC.getAllProduct(price1,price2);

        sc.close();
    }
}
