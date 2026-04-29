package application;

import entities_.Client;
import entities_.OrderItem;
import entities_.Produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    static void main() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client cl = new Client("Ana", "anamaria@gmail.com", sdf.parse("21/05/2000"));


        sc.close();
    }
}
