package CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Double> doubles1 = new ArrayList();
        List<Double> doubles2 = new ArrayList();
        doubles1.add(12.5);
        doubles1.add(12.4);
        doubles1.add(12.7);


        doubles2.add(33.5);
        doubles2.add(43.4);
        doubles2.add(67.6);

        doubles1.addAll(doubles2);

        System.out.println("List 1 : ");
        for (Double dob1 : doubles1) {
            System.out.println(dob1);
        }

        System.out.println("List 2 : ");
        for (Double dob2 : doubles2) {
            System.out.println(dob2);
        }

        System.out.println(doubles1.contains(33.9));
    }
}
