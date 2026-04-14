package aplication;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class problemaFuncionarioList {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        var list = new ArrayList<Employee>();


        System.out.println("How many employees will be registred? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee # " + (i + 1) + ":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            while (hasID(list, id)) {
                System.out.println("Id already! Try again: ");
                id = sc.nextInt();

            }
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        int opcId = sc.nextInt();
        Integer ps = positionId(list, opcId);
        if (ps == null) {
            System.out.println("This id does not exist.");
        } else {
            System.out.println("Enter the porcentenge: ");
            double porcent = sc.nextDouble();
            list.get(ps).increaseSalary(porcent);
        }

        System.out.println();
        System.out.println("list of employees: ");
        for (Employee x: list) {
            System.out.println(x);
        }



        sc.close();
    }

    public static Integer positionId(List<Employee> list, int id) {
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
        // outra maneira de fazer essa busca do id é usando o seguinte no codido principal: Employee emp = list.stram().filter(x -> x.getId() == opcId).findFirst().orElse(null); )
    }

    public static boolean hasID(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
        // outra forma de fazer isso é usando o anyMach, pois ja retorna um True ou False, sendo mais eficiente: list.stream().anyMatch(x -> x.getId() == id);
    }
}
