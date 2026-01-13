import java.util.Comparator;
import java.util.PriorityQueue;

public class Challenge94 {
    //11.94  -> Create a priorityQueue with custom Student class with name and grade attributes
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });
        queue.offer(new Student("Sain", 'B'));
        queue.offer(new Student("Rina", 'A'));
        queue.offer(new Student("Tina", 'B'));
        queue.offer(new Student("Bina", 'D'));
        queue.offer(new Student("Rija", 'A'));
        queue.offer(new Student("Nili", 'C'));
        System.out.printf("Queue is :  %s \n", queue);
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
    }

    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + " : " + grade;
        }
    }
}
