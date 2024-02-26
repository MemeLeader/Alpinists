package ALPS;

public class Alpinist {
    private String name;
    private int age;
    private String adres;

    public Alpinist(String name, int age, String adres) {
        this.name = name;
        this.age = age;
        this.adres = adres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}