public class Ch06Lec09 {
    //lec54 --> code blocks
    public static void main(String[] args) {

        Car3 mycar1 = new Car3();
        System.out.println(Car3.seat);
        System.out.println(mycar1.seat);

    }
}
// Static Scope er variable er value ba static variable er value  class create korer time a assign hoi  ebong non-static scope er variable er value ba non-static variable er value object create korer time a assign hoi
class Car3 {
    static int seat;

    static {
        seat = 0;
        System.out.println("this is static scope");
    }

    {
        seat++;
        System.out.println("this is normal scope");

    }
}