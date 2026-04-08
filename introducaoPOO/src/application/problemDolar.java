package application;

import entities.utilConverterMoney;

import java.util.Locale;
import java.util.Scanner;

public class problemDolar {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a cotação do dolar: ");
        double valorDolar = sc.nextDouble();

        System.out.println();
        System.out.println("Informe quantos dollars deseja: ");
        double quantDolar = sc.nextDouble();


        System.out.println();
        System.out.println("Valor total em reais a pagar: " + utilConverterMoney.converter(valorDolar, quantDolar));
    }
}
