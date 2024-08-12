package lessons_11;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Jark");
        Cat cat = new Cat("Brain");
        Cat cat2 = new Cat("Mery");

        dog.run(150);
        dog.swim(5);
        cat.run(100);
        cat.swim(10);
        System.out.println("Create animals: " + Animal.getAnimalCount());

        Bowl bowl = new Bowl(10);
        cat.eat(bowl);
        cat2.eat(bowl);

        System.out.println("Is jark full? " + cat.isFull());
        System.out.println("Is Mery full? " + cat2.isFull());

        bowl.addFood(5);
        System.out.println("Add 5 in the bowl and now there " + bowl.food + "point of food");
    }
}
