class Animal {

    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat Meows");
    }
}

class Cow extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cow Moos");
    }
}

public class AnimalSoundSimulator {

    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.makeSound();

        a = new Cat();
        a.makeSound();

        a = new Cow();
        a.makeSound();
    }
}