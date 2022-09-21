package ss7_abstract_class_and_interface.practice07.class_animal_and_interface_edible.animal;

import ss7_abstract_class_and_interface.practice07.class_animal_and_interface_edible.animal.Animal;
import ss7_abstract_class_and_interface.practice07.class_animal_and_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    public String howToEat() {
        return "could be fried";
    }
}
