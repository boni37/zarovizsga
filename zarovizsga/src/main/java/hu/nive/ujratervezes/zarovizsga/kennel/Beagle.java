package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog {

    public Beagle(String name) {
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
        this.happiness += 2;
    }

    @Override
    void play(int hours) {
        this.happiness += hours * 2;
    }
}
