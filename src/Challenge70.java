public class Challenge70 {
    //70 -> Defining Student class
    public static void main(String[] args) {
        Student1 student1 = new Student1("Rina", 20, 102, "House No. 4");
        System.out.println(student1);
    }
}

class Student1 {
    String name;
    int age;
    int rollNumber;
    String house;

    public Student1(String name, int age, int rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                ", house='" + house + '\'' +
                '}';
    }
}