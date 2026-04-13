package entities;

public class Rent {
    private String name;
    private  String emial;

    public Rent(){
    }

    public Rent(String name, String emial) {
        this.name = name;
        this.emial = emial;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ", " + emial;
    }
}
