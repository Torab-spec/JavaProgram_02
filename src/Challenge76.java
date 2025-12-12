public class Challenge76 {
    //Ch76 -> Creating Obj with Final fields and constructor
    public static void main(String[] args) {
        FinalCar finalCar = new FinalCar(4, 6, "Black", "Maruti 800");
        System.out.println(finalCar);


    }
}

class FinalCar {
    final int numOfWheels;
    final int numOfSeats;
    final String color;
    final String modelName;

    public FinalCar(int numOfWheels, int numOfSeats, String color, String modelName) {
        this.numOfWheels = numOfWheels;
        this.numOfSeats = numOfSeats;
        this.color = color;
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "FinalCar {" +
                "numOfWheels=" + numOfWheels +
                ", numOfSeats=" + numOfSeats +
                ", color='" + color + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
