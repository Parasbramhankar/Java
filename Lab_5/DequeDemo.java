package Lab_5;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

public class DequeDemo {
    public static void main(String[] args) {
        Queue<Double> dQueue = new ArrayDeque<>();

        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < sc.nextInt(); i++) {
            dQueue.add(sc.nextDouble());
        }

        Iterator itr = dQueue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Is empty ! : " + dQueue.isEmpty());
        System.out.println("Size: "+dQueue.size());
//        Remove
        dQueue.removeAll(dQueue);
        System.out.println("Size after Remove all"+dQueue.size());

//     checking after removing elements
        System.out.println("Is empty ! : " + dQueue.isEmpty());
    }
}

