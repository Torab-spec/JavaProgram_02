package chapterNine.challenge84;

public class Eagle extends Bird {

    public Eagle() {
        super("Eagle"); // It is necessary because Bird has constructor , and if we want to call a constructor from parent then we must use super keyword
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");

    }
}
