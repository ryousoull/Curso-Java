package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mainList {
    static void main() {

        List<String> list = new ArrayList<>();

        list.add("Bruce");
        list.add("Ace");
        list.add("Maria");
        list.add("Kuro");
        list.add(2,"Sekiro");

        System.out.println("Tamanho da lista: " + list.size());


        for(String x: list) {
            System.out.println(x);
        }

        System.out.println("----------------------");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M'); //predicado, remove se a primeira letra conter 'm'
        for(String x: list) {
            System.out.println(x);
        }

        System.out.println("----------------------");
        System.out.println("Index of bruce: " + list.indexOf("Bruce"));
        System.out.println("Index of sekiro: " + list.indexOf("Sekiro"));

        System.out.println("----------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').toList();
        for(String x: result) {
            System.out.println(x);
        }

        System.out.println("----------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


    }
}
