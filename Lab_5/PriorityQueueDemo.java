package Lab_5;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i <=n; i++) {
            String as=sc.nextLine();
            pq.add(as);
        }

        System.out.println("Elements of Queue : " + pq);

        System.out.println("Peek element : " + pq.peek());

        System.out.println("Elements of Queue : " + pq);

        System.out.println("Poll element : " +pq.poll());

        System.out.println("Elements of Queue : " + pq);
//size
        System.out.println("Size : " + pq.size());

    }
 }
