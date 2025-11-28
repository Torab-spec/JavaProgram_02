public class Ch06Lec07 {
    //lec52 --> Static keyword
    public static void main(String[] args) {
        Animal.leg = 4; // static variable directly access by the class name
        System.out.println(Animal.leg);
        //Animal.eye;// Give eror || eye can't be access by the class name cz eye is non-static
        Animal animal = new Animal(); // Creating object for non-static variable
        animal.eye = 2; // accessing non-static variable using object
        System.out.println(animal.eye);


    }

    public static void notes() {
        System.out.println("1. Jodi class k static declair kora hoi tahole  sei class er attribute guli k use korte chaile object create \n kora lahena . proptery ba method guli k direct use kora jai ");
        System.out.println("2. kintu jodi kono class k static declair na kora hoi tahole sei class er attribute \n guli k use korte chaile prothome class tir object bania newar por attributes guli k use kora jai \n direct class dea use kora jai na");
        System.out.println("3. ei jonne main() a static keyword use kora hoi jate kore compilier main \n method ti k dircetly li use korte pare kono rokom object chara");

    }

}

class Animal {
    static int leg; // Static variable
    int eye; // Non-static variable

}
