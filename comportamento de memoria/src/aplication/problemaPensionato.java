package aplication;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class problemaPensionato {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println("How many rooms will ve rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("RENT # " + i + ":");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Room: ");
            int number = sc.nextInt();

            vect[number] = new Rent(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }


        sc.close();
    }
}
