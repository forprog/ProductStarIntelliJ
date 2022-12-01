package Lesson16;

import java.util.ArrayList;
import java.util.List;

public class Homework1 {
    public static void main(String[] args) {
        Stable<Horse> stable = new Stable<>();
        Stable<Animal> stable2 = new Stable<>();
        var horse1 = new Horse();
        var horse2 = new ArabianHorse();

        List<Horse> horses1 = new ArrayList<>();
        List<ArabianHorse> horses2 = new ArrayList<>();


        stable.addAnimal(horse1);
        stable.addAnimal(horse2);

        stable.addAllAnimals(horses1);
        stable.addAllAnimals(horses2);

        moveAnimals(stable,stable2);

    }

    public static <T> void moveAnimals(Stable<? extends T> stableFrom, Stable<? super T> stableTo){
        stableTo.addAllAnimals(stableFrom.getAllAnimals());
    }

}
