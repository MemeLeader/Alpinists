package ALPS;

public class Groups {
    public static void showGroups(Alpinist[] Group1, Alpinist[] Group2, Alpinist[] Group3, Mountain[] mount) {
        System.out.println("Участники 1 группы:");
        System.out.println("Гора группы: " + mount[0].getName() + " | Высота: " + mount[0].getHigh() + " | Город: " + mount[0].getCountry());
        for (Alpinist e : Group1) {
            System.out.println("Имя: " + e.getName() + " | Возраст: " + e.getAge() + " | Город: " + e.getAdres());
        }

        System.out.println("Участники 2 группы:");
        System.out.println("Гора группы: " + mount[1].getName() + " | Высота: " + mount[1].getHigh() + " | Город: " + mount[1].getCountry());
        for (Alpinist r : Group2) {
            if (r != null) {
                System.out.println("Имя: " + r.getName() + " | Возраст: " + r.getAge() + " | Город: " + r.getAdres());
            }
        }

        System.out.println("Участники 3 группы:");
        System.out.println("Гора группы: " + mount[2].getName() + " | Высота: " + mount[2].getHigh() + " | Город: " + mount[2].getCountry());
        for(Alpinist f : Group3) {
            if (f != null) {
                System.out.println("Имя: " + f.getName() + " | Возраст: " + f.getAge() + " | Город: " + f.getAdres());
            }
        }
    }
}
