class Food {

    void prepareFood() {
        System.out.println("Preparing Food");
    }
}

class Pizza extends Food {

    @Override
    void prepareFood() {
        System.out.println("Preparing Pizza");
    }
}

class Burger extends Food {

    @Override
    void prepareFood() {
        System.out.println("Preparing Burger");
    }
}

class Sandwich extends Food {

    @Override
    void prepareFood() {
        System.out.println("Preparing Sandwich");
    }
}

public class FoodOrder {

    public static void main(String[] args) {

        Food f;

        f = new Pizza();
        f.prepareFood();

        f = new Burger();
        f.prepareFood();

        f = new Sandwich();
        f.prepareFood();
    }
}