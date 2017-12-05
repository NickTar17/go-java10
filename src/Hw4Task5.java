import java.util.Scanner;

public class Hw4Task5 {

    public static void Recurtion(int x) {

        if (x > 0) {
            Recurtion(x - 1);
            System.out.println(x + " ");
        }
    }



    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        Recurtion(x);
    }
}