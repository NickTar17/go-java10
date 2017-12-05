import java.util.Scanner;

public class Hw4task1 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение х : ");

        for(int x = sc.nextInt(),res = 1; res <= x; res ++)
            System.out.println(res);
    }
}
