package Encapsulation.PaytmKaro;

import Encapsulation.PaytmKaro.Paytm;

import java.util.Scanner;

public class TestPaytm {
    public static void main(String[] args) {
    Paytm paytm=new Paytm();
        Scanner sc=new Scanner(System.in);
        paytm.createCustomer();
        paytm.createCustomer();
        System.out.println("Enter Account number: ");
        paytm.getBalance(sc.nextInt());
    }
}
