package application;

import Entities.Employee;
import Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Employee> listEmployee = new ArrayList<>();

        System.out.println("Informe o numero de funcionarios: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Informe os dados do funcionario #" + i);
            System.out.println("Terceirizado? (YES/NO) ");
            char opc = sc.next().toLowerCase().charAt(0);
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Horas: ");
            Integer horas = sc.nextInt();
            System.out.println("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            if(opc == 'y'){
                System.out.println("Valor adicional do terceirizado: ");
                double charge = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(nome,horas,valorPorHora, listEmployee, charge);
                listEmployee.add(employee);
            } else {
                Employee employee = new Employee(nome, horas, valorPorHora, listEmployee);
                listEmployee.add(employee);
            }
        }

        System.out.println();
        System.out.println("PAMENTOS: ");
        for (Employee emp : listEmployee) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

    }
}
