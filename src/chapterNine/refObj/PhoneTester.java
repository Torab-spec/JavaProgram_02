package chapterNine.refObj;

public class PhoneTester {
    public static void main(String[] args) {
        Phone phone = new Phone();
        SmP smp = new SmP();
        SsP ssp = new SsP();
        System.out.println("1");
        phone.call();
        smp.call();
        smp.playMusic();
        ssp.call();
        ssp.takeSnap();

        System.out.println("2");

        Phone pSmP = new SmP(); //upperCasting

        pSmP.call();
//        pSmP.playMusic; not allowed;

        System.out.println("3");

//        SmP p1 = new Phone();//downCasting // not allowed
//        SmP p1 = (SmP) new Phone(); //Not allowed in this way

        SmP p2 = (SmP) pSmP;
        p2.playMusic();
        p2.call();

    }


}
