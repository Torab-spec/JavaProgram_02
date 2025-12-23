package chapterNine.challenge83;

public class Square extends Shape {
    private final double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    public double getSideLen() {
        return sideLen;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideLen, 2);
    }
}
