import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {
    static void main() {

        /* antiga versao: */
        Scanner sc = new Scanner(System.in);
        String x;
        System.out.println("Informe seu nome: ");
        x = sc.next(); // apenas o next() = le apenas uma palavra, para ler a linha inteira usa-se nextLine()
        System.out.println("Voce digitou: " + x);

        Locale.setDefault(Locale.US);
        Double y = sc.nextDouble();
        System.out.printf("Voce digitou %.2f\n",y);

        sc.close();
    }
    /* nova versao: */
   // void main () {
       // String name = IO.readln("Digite seu nome: ");
       // IO.println("Olá, " + name); //
   // }
}
