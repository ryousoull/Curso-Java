package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class problemaStudent {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Nome: ");
        student.name = sc.nextLine();
        System.out.println("Digite as notas: ");
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.println();
        System.out.println("Soma das notas: " + student.total());
        if (student.total() < 60) {
            System.out.println("Falhou");
            System.out.println("Falta " + String.format("%.2f", student.pontos()) + " pontos");
        } else {
            System.out.println("Aprovado!");
        }

        sc.close();
    }
}
