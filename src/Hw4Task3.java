import java.util.Scanner;

public class Hw4Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weidth of the rectangle: ");
        int w = sc.nextInt();

        for (int j = 0; j < w; j++) {
            for (int i = 0; i < w; i++) {
                if (i == w)
                    System.out.print("+");

                else
                    System.out.print("+");

            }
            System.out.println();
        }

        //---------------Triangle------------------

        System.out.println("Triangle");
        int amount = sc.nextInt();

        for (int i = 0; i < amount; i++) {
            for (int k = 0; k < i + 1; k++) {
                // Здесь условие даже немного проще
                if (k == 0 || k == i || i == amount - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Переход на следующую строку
            System.out.println();
        }

    }
}