package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();

    public Kennel() {
    }

    public Kennel(List<Dog> dogs) {
        this.dogs = dogs;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void feedAll() {
        for (Dog dog : dogs) {
            dog.feed();
        }
    }

    public Dog findByName(String name) {
        for (Dog dog : dogs) {
            if (name.equals(dog.getName())) {
                return dog;
            }
        }
        throw new IllegalArgumentException("Name is invalid");
    }

    public void playWith(String name, int hour) {
        for (Dog dog : dogs) {
            if (name.equals(dog.name)) {
                dog.play(hour);
            }
        }
    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> happyDogs = new ArrayList<>();
        for (Dog dog : dogs) {
            if (dog.happiness > minHappiness) {
                happyDogs.add(dog.name);
            }
        }
        return happyDogs;
    }
}
