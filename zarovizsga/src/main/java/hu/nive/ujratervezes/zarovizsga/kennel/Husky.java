package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog{

    private int happiness;

    public Husky(String name) {
        super(name);
    }

    @Override
    public int getHappiness() {
        return happiness;
    }

    @Override
    public void play(int i) {
        this.happiness += i*3;
    }

    @Override
    public void feed() {
        this.happiness += 4;
    }
}
