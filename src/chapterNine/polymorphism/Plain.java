package chapterNine.polymorphism;

class Plain implements Vehicle {
    public void plainSound() {
        System.out.println("Whoosssss....");
    }

    @Override
    public void start() {
        System.out.println("Plain starting...");
    }
}
