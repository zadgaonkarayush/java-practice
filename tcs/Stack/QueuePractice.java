package tcs.Stack;
import java.util.*;
public class QueuePractice {
    public static void main(String[] args){
        Queue<Integer>q = new LinkedList<>();

        q.offer(12);
        q.offer(20);
        q.offer(56);

        System.out.println(q.peek());
        q.poll();
                System.out.println(q.peek());

    }
}
