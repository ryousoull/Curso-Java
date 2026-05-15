package aplication;

import java.util.Scanner;

public class EhPalindromo {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma palavra: ");
        String nome = sc.nextLine();

        StringBuilder sb = new StringBuilder(nome);

        sb.reverse();

        System.out.println("Invertido: " + sb);
        String invertido = sb.toString();

        if(nome.equals(invertido)) {
            System.out.println("Eh palindromo");
        } else {
            System.out.println("Nao eh palindromo");
        }
    }
}
