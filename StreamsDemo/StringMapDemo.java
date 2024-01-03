package StreamsDemo;

import java.util.ArrayList;
import java.util.List;

public class StringMapDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList();
        strings.add("Java");
        strings.add("Python");
        strings.add("Pascal");
        strings.add("Ruby");
        strings.add("Scala");
        strings.add("HTML");
        strings.add("ReactJS");

        List<String> languageRP = strings.stream().filter(str -> str.startsWith("P") || str.startsWith("R")).toList();

        System.out.println("Languages starts with R and P : " + languageRP);

        // By using lambda expression
        strings.stream().filter(str -> str.startsWith("P") || str.startsWith("R")).forEach(i -> System.out.println(i));
        // By using method reference
        strings.stream().filter(str -> str.startsWith("P") || str.startsWith("R")).forEach(System.out::println);
    }
}
