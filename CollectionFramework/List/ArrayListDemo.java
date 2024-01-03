package CollectionFramework.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(123);   //Index 0
        list.add(999);   //Index 1
        list.add(999);   //Index 2
        list.add(777);   //Index 3
        list.add(333);   //Index 4
        list.add(333);   //Index 5

//        list.sort(Integer::compareTo);
        Collections.sort(list);
        for (Integer arr : list) {
            System.out.println(arr);
        }

        System.out.println("Size : " + list.size());


    }
}
