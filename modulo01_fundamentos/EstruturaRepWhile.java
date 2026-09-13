package modulo01_fundamentos;

public class EstruturaRepWhile {

    public static void main(String[] args) {

        int x = 5;
        int y = 0;

        while (x != 0) {
            y += 1;
            x -= 1;
            System.out.println("X é = " + x + " Y é = " + y);
        }
    }
}

// Usar while quando não se sabe a quantidade de vezes que o bloco vai precisar ser executado.