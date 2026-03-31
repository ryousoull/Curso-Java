public class funcoesString {
    static void main() {
        String original = "abcde FGHIJ abc DEAF";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2); // começa do orginal[2]
        String s05 = original.substring(2,9); // marca o inicio e final
        String s06 = original.replace('a','x'); // troca toda vez que acha o primeiro valor de parametro pelo segundo valor no parametro

        System.out.println("Original: " + original);
        System.out.println("toLoweCase: " + s01);
        System.out.println("toUpperCase: " + s02);
        System.out.println("trim (elimina o espaço no final): " + s03);
        System.out.println("exemplo de substring: " + s04);
        System.out.println("exemplo de substring: " + s05);
        System.out.println("exemplo de replace: " + s06);

        System.out.println();

        String s = "Batman Alfred Robin";
        String[] vect = s.split(" "); //separa a String 's' por meio da declração do seperador e armazena em um vetor
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);




    }
}
