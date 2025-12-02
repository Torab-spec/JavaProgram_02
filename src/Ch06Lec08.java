public class Ch06Lec08 {
    //lec53 --> Constructor
    public static void main(String[] args) {
        // by default o constructor creat thake kintut seta blanck thake. constructor creat na thakleo construct by default creat thake kintu tar moddhe kono rokom value thake na

        Car1 myCar = new Car1();
        System.out.println(myCar.color); // getting default value of color which is assign in constructor
        myCar.color = "red"; // reassign value of color;
        System.out.println(myCar.color); // getting reassign value

        System.out.println(" ");

        Car2 myCar2 = new Car2("blue"); // Invoking a parameterized constructor
        System.out.println(myCar2.color);


    }
}

class Car1 {
    String color;
    int wheel;
    int seat;

    public Car1() {  // default constructor
        color = "black";  // black is  default value of color ; when the color i.v call through the object we get black color as default value; we can reassign the value of color .
        wheel = 4;
    }
}


class Car2 {
    String color;
    int wheel;
    int seat;

    public Car2(String color) { // Parameterized constructor
        this.color = color;
        seat = 4;
        wheel = 6;
    }
}