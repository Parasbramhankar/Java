package StreamsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceConcatination {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Core");
        strings.add("Advance");

        Optional<String> concat = strings.stream().reduce((str1, str2) -> str1 + "-" + str2);

        concat.ifPresent(System.out::println);
    }
}
