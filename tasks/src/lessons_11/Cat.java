package lessons_11;

public class Cat extends Animal{
    private boolean isFull;

    public Cat(String name) {
        super(name, 200, 0);
        isFull = false;
    }

    public void eat(Bowl bowl) {
        if (bowl.food > 0) {
            if (bowl.food >= 15) {
                isFull = true;
                bowl.food -= 15;
                System.out.println(name + " Ate from the bowl.");
            } else {
                System.out.println(name + " Didn't eat from the bowl, there isn't enough.");
            }
        } else {
            System.out.println(name + " Didn't eat from the bowl, there isn't empty.");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}
