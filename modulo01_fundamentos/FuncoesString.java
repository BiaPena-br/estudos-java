package modulo01_fundamentos;

public class FuncoesString {

    public static void main(String[] args) {

        String original = "abcd MNOP ABC abc XYZ";

        String s01 = original.toLowerCase(); // transforma a String toda para minúscula.
        String s02 = original.toUpperCase(); // transforma a String toda para maiúscula.
        String s03 = original.trim(); // retira os espaços extras no início e fim da String.
        String s04 = original.substring(2); // recorta a String a partir do início que você colocar entre ().
        String s05 = original.substring(2, 9); // recorta a String a partir do início até o fim que você colocar entre ().
        String s06 = original.replace("b", "h"); // substitui o que está entre (), pode ser char ou String.
        int i = original.indexOf("bc"); // mostra o índice da esquerda para direita.
        int j = original.lastIndexOf("X"); // mostra o índice da direita para a esquerda.
        String frutas = "lemon pineapple orange";
        String[] vect = frutas.split(" "); // split  divide a String com base em um delimitador, nesse caso foi o espaço(" ").
        String w1 = vect[0];
        String w2 = vect[1];
        String w3 = vect[2];

        System.out.println("Original: " + original);
        System.out.println("LowerCase: " + s01);
        System.out.println("UpperCase: " + s02);
        System.out.println("trim: " + s03);
        System.out.println("substring 1: " + s04);
        System.out.println("substring 2: " + s05);
        System.out.println("replace: " + s06);
        System.out.println("indexOf: " + i);
        System.out.println("lastIndexOf: " + j);
        System.out.println("split: " + w1 + " " + " " + w2 + " " + w3);
    }
}