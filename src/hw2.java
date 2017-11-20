import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {

        Scanner pss = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = pss.nextLine();

        System.out.println("Введите город");
        String city = pss.nextLine();

        System.out.println("Введите возраст");
        Integer age = pss.nextInt();

        Scanner ps1 = new Scanner(System.in);
        System.out.println("Введите свое хобби");
        String hobby = ps1.nextLine();


        System.out.println();
        System.out.println("Имя : " + name);
        System.out.println("Город : " + city);
        System.out.println("Возраст : " + age);
        System.out.println("Хобби : " + hobby);


        System.out.println();
        System.out.println();


        System.out.println("Человек по имени " + name +  " живет в городе " + city + " .");
        System.out.println("Этому человеку " + age  + " лет и любит он заниматься " + hobby + " .");


        System.out.println();
        System.out.println();

        System.out.println(name + " - Имя ");
        System.out.println(city + " - Город ");
        System.out.println(age + " - Возраст");
        System.out.println(hobby + " - Хобби");


        System.out.println("Hello world");
    }
}
