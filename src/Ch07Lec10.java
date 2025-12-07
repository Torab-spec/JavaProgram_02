public class Ch07Lec10 {
    //toString method
    public static void main(String[] args) {
        Car5 car4 = new Car5(4, 4, 120, "Swift", "SW982", "Maruti");

        System.out.println(car4.toString());
    }

}

class Car4 {
    int noOfWheel;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car4(int noOfWheel, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheel = noOfWheel;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Car5{" +
                "noOfWheel=" + noOfWheel + ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' + '}';
    }
}