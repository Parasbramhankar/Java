package StreamsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceDemoString {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Honda");
        strings.add("Kinetic");
        strings.add("Kinetic");
        strings.add("Bajaj");
        strings.add("Suzuki");
        strings.add("TVS");

        Optional<String> longestString = strings.stream().reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2);
        longestString.ifPresent(System.out::println);
        //System.out.println("Longest String : " + longestString + " Result");

    }
}
