package lesson6;

public class Animal {
    private int runMaxDistance;
    private int swimMaxDistance;
    private double jumpMaxHeight;

    public Animal(int runMaxDistance, int swimMaxDistance, double jumpMaxHeight) {
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        this.jumpMaxHeight = jumpMaxHeight;
    }

    public void run(int runDistance) {
        System.out.println("run: " + (runDistance <= runMaxDistance));
    }

    public void swim(int swimDistance) {
        System.out.println("swim: " + (swimDistance <= swimMaxDistance));
    }

    public void jump(double jumpHeight) {
        System.out.println("jump: " + (jumpHeight <= jumpMaxHeight));
    }

    public static void main(String[] args) {

        System.out.println("Кошка1: ");
        Animal cat1 = new Cat(200, 0, 2);
        cat1.run(888);
        cat1.swim(2);
        cat1.jump(2);

        System.out.println("Кошка2: ");
        Animal cat2 = new Cat(400, 6, 2.3);
        cat2.run(350);
        cat2.swim(6);
        cat2.jump(1.1);

        System.out.println("Собака1: ");
        Animal dog1 = new Dog(500, 10, 0.5);
        dog1.run(400);
        dog1.swim(8);
        dog1.jump(5);

        System.out.println("Собака2: ");
        Animal dog2 = new Dog(900, 40, 12);
        dog2.run(999);
        dog2.swim(6);
        dog2.jump(9);
    }
}
