package Lesson16;

import java.util.ArrayList;
import java.util.List;

public class Stable<T> {
    private final List<T> animals = new ArrayList<>();

    public List<T> getAllAnimals() {
        return this.animals;
    }

    public T addAnimal(T animal){
        this.animals.add(animal);
        return animal;
    }

    public void addAllAnimals(List<? extends T> animals){
        this.animals.addAll(animals);
    }
}
