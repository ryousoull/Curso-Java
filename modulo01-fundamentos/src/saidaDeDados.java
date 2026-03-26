public class saidaDeDados {
    static void main() {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f\n",product1,price);
        System.out.printf("%s, which price is $ %.2f\n",product2, price2);

        IO.println();

        System.out.println("Record: " + age + " years old, code" + code + " and gender: " + gender);

        IO.println();

        System.out.println("Measue with eigth decimal places: " + measure);
        System.out.printf("Rouded (tree decimal places): %.3f", measure);


    }
}
