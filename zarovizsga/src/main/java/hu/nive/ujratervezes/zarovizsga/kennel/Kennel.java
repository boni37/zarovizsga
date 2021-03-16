package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;


public class Kennel extends Dog{

    private List<Dog> dogs = new ArrayList<>();

    public Kennel(String name) {
        super(name);
    }

    private int happiness;

    public int getHappiness() {
        return happiness;
    }



    public void addDog(Dog name) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(name));
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void feedAll() {
    }

    public void findByName(String name) {
    }

    public void playWith(String name, int i) {
    }

    public List<Dog> getHappyDogNames(int i) {
        return null;
    }
}
