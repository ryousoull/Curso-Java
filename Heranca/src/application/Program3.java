package application;

import Entities.Company;
import Entities.Individual;
import Entities.Payer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Payer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int numbers = sc.nextInt();
        for (int i = 0; i < numbers; i++) {
            System.out.println("Individual or company (i/c)? ");
            char opc = Character.toLowerCase(sc.next().charAt(0));
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if (opc == 'i') {
                System.out.println("Health Expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (opc == 'c') {
                System.out.println("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new Company(name, anualIncome, employees));
            } else {
                System.out.println("ERRO");
            }
        }

        System.out.println();

        System.out.println("TAXES PAID: ");
        double sum = 0;
        for (Payer p : list) {
            System.out.printf("%s: $ %.2f\n", p.getName(), p.tax());
            sum += p.tax();
        }

        System.out.println();
        System.out.printf("TOTAL TAX: $ %.2f", sum);

    }
}
