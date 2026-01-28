package chapterThirteen;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda test = new TestingLambda();
        int sum = test.sum(6, 7);
        test.printString("This java best course");
    }

    public int sum(int a, int b) {
        return a + b;
    }

//    int add = (int a, int b) -> a+b;

    public void printString(String string) {
        System.out.println(string);
    }
}


// Functional interface mane holo j kono interface a jodi ektai method thake ebong method ti jodi un implement thake tahole sei interface ti k funtional interface bole