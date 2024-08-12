package lessons_11;

public class Animal {
        protected String name;
        protected int runLimit;
        protected int swimLimit;
        protected static int animalCount = 0;

        public Animal(String name, int runLimit, int swimLimit) {
            this.name = name;
            this.runLimit = runLimit;
            this.swimLimit = swimLimit;
            animalCount++;
        }

        public void run(int distance) {
            if (distance <= runLimit) {
                System.out.println(name + " run " + distance + " m.");
            } else {
                System.out.println(name + " can't run " + distance + " m., limit is " + runLimit + " m.");
            }
        }

        public void swim(int distance) {
            if (distance <= swimLimit) {
                System.out.println(name + " swim " + distance + " m.");
            } else {
                System.out.println(name + " can't swim " + distance + " m., limit is " + swimLimit + " m.");
            }
        }

        public static int getAnimalCount() {
            return animalCount;
        }
    }

