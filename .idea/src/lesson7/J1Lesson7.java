/**
 * Java. Level 1. Lesson 7
 *
 * @author Dzyubenko Vadim
 * @version dated 20.06.2018
 */
class J1Lesson7 {
    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] x = {new Cat("Ben4", 7), new Cat("Ben5", 5), new Cat("Ben", 15), new Cat("Ben1", 15), new Cat("Ben2", 50), new Cat("Ben3", 100), new Cat("Ben6", 50)};
        Plate plate = new Plate(100);
    for (Cat c : x) {
        if (!c.isFull() && c.getAppetite() > plate.getFood()) {
            plate.increaseFood(100);
        }
        c.eat(plate);
        System.out.println(c);
        System.out.println(plate);

     }
    }
}


class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "CAT: " + name + " | APPETITE: " + appetite + "| ISFULL: " + isFull;
    }

    void eat(Plate plate) {
        if (plate.getFood() >= appetite && !isFull) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "PLATE: " + food;
    }

    void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    int getFood() {
        return food;
    }

    void increaseFood(int amount) {
        food += amount;
    }
}
