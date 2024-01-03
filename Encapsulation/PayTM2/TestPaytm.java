package Encapsulation.PayTM2;

import Encapsulation.PayTM2.Paytm;

import java.util.Scanner;

public class TestPaytm {
    public static void main(String[] args) {
        Paytm paytm = new Paytm();
        Scanner sc = new Scanner(System.in);
        paytm.createCustomer();
        paytm.createCustomer();
        System.out.println("Enter UPI pin to check balance : ");
        int pin = sc.nextInt();
        paytm.getBalance(pin);
    }
}
