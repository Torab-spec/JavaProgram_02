public class Ch07Lec12 {
    //StringBuffer & StringBuilder
    public static void main(String[] args) {

        StringBuilder sentence = new StringBuilder("Hey ");
        sentence.append("sain ");
        sentence.append("How are you ? ");

        sentence.append("hi").append("sain");

        System.out.println(sentence);
    }
}

class Car5 {
    int noOfWheel;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car5(int noOfWheel, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheel = noOfWheel;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    // it works like to string
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car5{");
        sb.append("noOfWheel=").append(noOfWheel);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
