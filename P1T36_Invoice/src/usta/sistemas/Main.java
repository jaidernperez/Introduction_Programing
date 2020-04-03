package usta.sistemas;

import java.util.Scanner;

public class Main {
    /* Author: Jaider Pérez
        Date 19/03/2020
        Description: This software simulates an invoice
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int product1, product2, product3, product4, sum;
        double total, iva;

        System.out.println("Bill software of the supermarket, input the first product ");
        product1 = keyboard.nextInt();
        System.out.println("Input the second product");
        product2 = keyboard.nextInt();
        System.out.println("Input the third product");
        product3 = keyboard.nextInt();
        System.out.println("Input the four product");
        product4 = keyboard.nextInt();

        sum = product1 + product2 + product3 + product4;
        iva = sum * 0.19;
        total = sum + iva;
        System.out.println("The subtotal of the this products: $" + sum+ " The IVA is: $" + iva+" The total is: $" + total);
    }
}
