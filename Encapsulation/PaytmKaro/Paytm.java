package Encapsulation.PaytmKaro;

import Encapsulation.PaytmKaro.Customer;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Paytm {

    ArrayList<Customer>customers=new ArrayList<>();

    public void createCustomer(){
        Customer customer=new Customer();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Customer's detail: ");
        System.out.println("Enter Name of Customer: ");
        customer.setName(sc.nextLine());
        System.out.println("Enter account Number: ");
        customer.setAcc(sc.nextInt());
        System.out.println("Enter pin: ");
        customer.setPin(sc.nextInt());
        System.out.println("Enter Balance: ");
        customer.setBalance(sc.nextDouble());

        customers.add(customer);
        System.out.println("New Customer Added");
    }

    public void getBalance(int acc)
    {
        Scanner sc=new Scanner(System.in);
        for(Customer list:customers){
           if(list.getAcc()==acc){
               System.out.println("Enter Pin: ");
               int pin=sc.nextInt();
               if(list.getPin()==pin)
               {
                   System.out.println("Customer Name: " + list.getName());
                   System.out.println("Customer Account number: " + list.getAcc());
                   System.out.println("Customer Balance: " + list.getBalance());
                   exit(0);
               }
               System.out.println("Wrong Pin");
               exit(0);
           }

        }
        System.out.println("Wrong Account number..!! ");

    }


}
