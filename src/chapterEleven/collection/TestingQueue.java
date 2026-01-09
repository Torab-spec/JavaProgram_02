package chapterEleven.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.offer(2);
        queue.add(3);

        queue.remove(2); //If we need to remove a specific element
//        queue.poll(); //no argument need
        System.out.println(queue.peek());
        System.out.println(queue.element());
        Utility2Collection.print(queue);


    }
}
