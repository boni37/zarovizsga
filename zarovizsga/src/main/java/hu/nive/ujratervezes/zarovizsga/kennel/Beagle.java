package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog{

    private int happiness;

    public Beagle(String name) {
        super(name);
    }

    @Override
    public int getHappiness() {
        return happiness;
    }

    @Override
    public void play(int i) {
        this.happiness += i*2;
    }

    @Override
    public void feed() {
        this.happiness += 2;
    }
}
