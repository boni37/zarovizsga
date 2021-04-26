package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog {

    public Husky(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHappiness() {
        return happiness;
    }

    @Override
    void feed() {
        this.happiness += 4;
    }

    @Override
    void play(int hours) {
        this.happiness += hours * 3;
    }
}
