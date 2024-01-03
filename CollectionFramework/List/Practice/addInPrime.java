package CollectionFramework.List.Practice;

import java.util.*;
public class addInPrime {
    public static void main(String[] args){

        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        al.add(sc.nextInt());
        al.add(sc.nextInt());
        al.add(sc.nextInt());
        al.add(sc.nextInt());
        al.add(sc.nextInt());

        al.stream().filter(num->{
            if(num<=1){
                return false;
            }
            if(num==2||num==3){
                return true;
            }
            if(num%2==0||num%3==0){
                return false;
            }
            for(int i=5;i<+Math.sqrt(num);i=i+6){
                if(num%i==0||num%(i+1)==0){
                    return false;
                }
            }
            return true;
        }).map(num->num+5).forEach(System.out::println);
    }
}
