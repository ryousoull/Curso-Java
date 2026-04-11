package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class mainVector {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//
//        double[] vect = new double[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Informe o numero da posicao " + i + ": ");
//            vect[i] = sc.nextDouble();
//        }
//
//        double sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += vect[i];
//        }
//
//        double avg = sum / n;
//
//        System.out.printf("AVERAGE HEIGHT = %.2f",avg);

        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++) { //posso usar também for(int i = 0; i < vect.length; i++)
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("AVERAGE PRICE = %.2f\n", avg);

        sc.close();




    }
}
