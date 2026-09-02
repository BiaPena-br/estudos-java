package modulo01_fundamentos;

public class SaidaDados{
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        Double price1 = 2100.0;
        Double price2 = 650.50;
        Double measure = 53.234567;

        System.out.printf("Products: \n%s, which price is $ %.2f\n%s, which price is $ %.2f\nRecord: %d years old, code %d and gender: %s\nMeasue with eight decimal place: %.8f\nRounded (three decimal places): %.3f\nUS decimal point: %.3f", product1, price1, product2, price2, age, code, gender, measure, measure, measure);
    }
}

// Para transformar em ponto flutuante com duas/quatro/seis/oito... casas decimais se usa o %.2f, %.4f, %.6f, %.8f...
// pode usar \n ou %n para quebra de linhas.
// A ordem da declaração das variáveis é importante, pois o printf vai imprimir na ordem que as variáveis foram declaradas.