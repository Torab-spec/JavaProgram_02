public class Challenge73 {
    //ch73 -> Dice Roller
    public static void main(String[] args) {
        Challenge73 dice = new Challenge73();
        System.out.println(dice.roller());

    }

    public int roller() {
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }
}
