public class Ch06Lec02 {
    // lec47 --> Instance variables & Methods

    public static void main(String[] args) {

    }
}

class Car {
    int wheel;
    String color;
    float maxSpeed;  // These are instance varibale
    float currentFuelInLitter;
    int numberOfSeats;

    public void drive() {
        if (currentFuelInLitter <= 0) {
            System.out.println("Your car has not fueled");
        } else if (currentFuelInLitter <= 5) {
            System.out.println("Please fueled your car");
            currentFuelInLitter--;

        } else {
            System.out.println("Your car is fully fueled , You can drive happily");
            currentFuelInLitter--;
        }

    }

    public void addFuel(float fuel) {
        currentFuelInLitter += fuel;     // these are instance method
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLitter;
    }


    public void blowHorn() {
        System.out.println("Horn blowing...");
    }
}



