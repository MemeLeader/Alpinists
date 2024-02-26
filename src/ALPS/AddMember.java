package ALPS;
import java.util.Scanner;
public class AddMember {

    private static int count2 = 0;
    private static int count3 = 0;
    public static void members(Alpinist[] Group2, Alpinist[] Group3){


        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите номер группы: (1,2,3)");
        int answ = sc.nextInt();
        switch (answ){
            case 1:
                System.out.println("Группа переполнена!");
                break;
            case 2:
                if (Group2[1] == null || Group2[2] == null) {
                    System.out.println("Введите имя:");
                    String name = sc.next();

                    System.out.println("Введите возраст:");
                    int age = sc.nextInt();

                    System.out.println("Введите город:");
                    String city = sc.next();

                    Alpinist newMember = new Alpinist(name, age, city);
                    count2++;
                    Group2[count2] = newMember;
                    System.out.println("Группа обновлена!");
                } else {
                    System.out.println("Группа переполнена!");
                }
                break;
            case 3:
                if (Group3[1] == null || Group3[2] == null) {
                    System.out.println("Введите имя:");
                    String name = sc.next();

                    System.out.println("Введите возраст:");
                    int age = sc.nextInt();

                    System.out.println("Введите город:");
                    String city = sc.next();

                    Alpinist newMember = new Alpinist(name, age, city);
                    count3++;
                    Group3[count3] = newMember;
                    System.out.println("Группа обновлена!");
                } else {
                    System.out.println("Группа переполнена!");
                }
                break;
            default:
                System.out.println("Вы ввели чтото не то");
        }
    }
}
