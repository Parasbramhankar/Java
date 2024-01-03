package Invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    private List<Product> products = new ArrayList<>();
    private List<Product> pro = new ArrayList<>();
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(List<Product> availableProducts) {
        Product obj=new Product();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        System.out.println("How many Product you want to buy");
        int quant=sc.nextInt();

        Product product = null;
        for (Product p : availableProducts) {

            if (p.getName().equals(name)) {
                product = p;
                obj.setName(p.getName());
                obj.setId(p.getId());
                obj.setPrice(p.getPrice());
                obj.setQuantity(quant);

                pro.add(obj);
                System.out.println("Product added to the cart.");
                break;
            }
        }

        //logic : I am checking product which i entered is present in available product list
        // if the product available then each available element i am entering into the
        // new list called pro arraylist,
        //
        // error: all works properly but there is a cache, if i add the product into cart and the product is
        // already present in the cart then just i need to update only quantity but it add this product( which is already
        // present in pro list ) as a new product in cart list.
        // i.e In stright forward in pro i am adding each product as a new product which is not present or already present in pro

        if (product == null) {
            System.out.println("Product not found");
            return;
        }

    }

    public void removeProduct(Product product1) {
        for (Product p : pro) {
            if (p.getId() == product1.getId()) {
                p.setQuantity(p.getQuantity() - product1.getQuantity());
                if (p.getQuantity() == 0) {
                    products.remove(p);
                }
                System.out.println("Product removed from the cart.");
                break;
            }
        }
    }
    public void generateInvoice() {
        System.out.println("Invoice:");
        double total = 0;
        for (Product p : pro) {
            double price = p.getPrice() * p.getQuantity();
            System.out.println(p.getName() + " x " + p.getQuantity() + " = " + price);
            total += price;
        }
        System.out.println("Total: " + total);
    }

    public List<Product> getProducts() {
        return pro;
    }

}


