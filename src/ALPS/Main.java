package ALPS;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Mountain[] mount = new Mountain[3];
        mount[0] = new Mountain("Эльбрус", "Россия", 5642);
        mount[1]  = new Mountain("Монблан", "Франция", 4808);
        mount[2]  = new Mountain("Everest", "Непал", 8848);

        // Alpinist alexey = new Alpinist("Леха", 25, "Питер")

        Alpinist[] Group1 = new Alpinist[3];
        Group1[0] =  new Alpinist("Леха", 25, "Питер");
        Group1[1] =  new Alpinist("Лепеха", 99, "Мухосранск");
        Group1[2] =  new Alpinist("Петя", 41, "Челябинск");

        Alpinist[] Group2 = new Alpinist[3];
             Group2[0] = new Alpinist("Бабич", 31, "Одесса");


        Alpinist[] Group3 = new Alpinist[3];
               Group3[0] = new Alpinist("Кира", 33, "Морио");

            while (true){
                System.out.println("Добро пожаловать в меню! Выберите желаемый пункт");
                System.out.println("1. Посмотреть состав групп");
                System.out.println("2. Добавить участника в группу");
                System.out.println("0. Выйти из системы");
                int menu = sc.nextInt();
                switch (menu){
                    case 1:
                        Groups.showGroups(Group1, Group2, Group3, mount);
                        break;
                    case 2:
                        AddMember.members(Group2, Group3);
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Вы ввели чтото не то");
                }
            }
    }


}