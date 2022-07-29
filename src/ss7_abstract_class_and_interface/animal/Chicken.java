package ss7_abstract_class_and_interface.animal;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    public String howToEat() {
        return "could be fried";
    }
}
