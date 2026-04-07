package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class problemaEmployee {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee funcionario = new Employee();
        System.out.println("Name: ");
        funcionario.name = sc.nextLine();
        System.out.println("Gross salary: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + funcionario);

        System.out.println("Which porcentage to increase salary? ");
        double porcentage = sc.nextDouble();
        funcionario.increaseSalary(porcentage);
        System.out.println();

        System.out.println("Updated data: " + funcionario);
    }
}
