package ALPS;

public class Mountain {
    private String name;
    private String country;
    private int high;

    public Mountain(String name, String country, int high) {
        this.name = name;
        this.country = country;
        this.high = high;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}