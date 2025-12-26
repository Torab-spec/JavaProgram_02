package chapterNine.polymorphism;

class Car implements Vehicle {
    public int numOfDoors() {
        return 5;
    }

    public void carSound() {
        System.out.println("vroom...");
    }


    @Override
    public void start() {
        System.out.println("Car starting...");
    }
}
