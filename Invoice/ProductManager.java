package Invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> products=new ArrayList<>();

    public void createProduct()
    {
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

        boolean exists = false;
        for (Product p : products) {
            if (p.getId() == P1.getId()) {
                p.setQuantity(p.getQuantity() + P1.getQuantity());
                exists = true;
                break;
            }
        }
        if (!exists) {
            products.add(P1);
            System.out.println("New Product Added");
        }
    }

    public void updateProduct(Product product) {
        for (Product p : products) {
            if (p.getId() == product.getId()) {
                p.setQuantity(product.getQuantity());
                break;
            }
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}

