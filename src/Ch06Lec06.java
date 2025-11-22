public class Ch06Lec06 {
    //lec51 --> This keyword
    public static void main(String[] args) {
        Cars myCar = new Cars();
        myCar.fuel = 4;
        System.out.println(myCar.fuel);
        myCar.setFuel(5);
        System.out.println(myCar.fuel);


    }
}

class Cars {
    int fuel;

    public void setFuel(int fuel) {
//        fuel = fuel; // not work properly
        this.fuel = fuel; // work properly


    }

    public void setsFuel(int enterFuel) {
        fuel += enterFuel;
    }

}

