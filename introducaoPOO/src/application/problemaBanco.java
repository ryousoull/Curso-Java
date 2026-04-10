package application;

import entities.cadastroBanco;

import java.util.Locale;
import java.util.Scanner;

public class problemaBanco {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        cadastroBanco user;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String nome = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)? ");
        String aux = sc.next();



        if ( "y".equalsIgnoreCase(aux)|| "yes".equalsIgnoreCase(aux)) {
            System.out.println("Enter initial deposit value: ");
            double value = sc.nextDouble();
            user = new cadastroBanco(number,nome, value);

        } else {
            user = new cadastroBanco(number,nome);
        }

        System.out.println("\nAccount data: ");
        System.out.println(user);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        user.enterDeposit(depositValue);
        System.out.println("Update accont data: ");
        System.out.println(user);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        depositValue = sc.nextDouble();
        user.withdrawValue(depositValue);
        System.out.println("Update accont data: ");
        System.out.println(user);
    }
}
