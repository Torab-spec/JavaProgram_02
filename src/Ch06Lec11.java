public class Ch06Lec11 {
    //lec56 ---> primitive v/s non-primitive
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();

        System.out.println(demo1.num);
        System.out.println(demo1.isWhat);
        System.out.println(demo1.name);

    }
}

class Demo1 {
    int num;
    boolean isWhat;
    String name;
}