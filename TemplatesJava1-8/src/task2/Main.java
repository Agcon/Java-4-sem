package task2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Human> input = new ArrayList<>();
        input.add(new Human(20, "Ab", "Za", LocalDate.of(1914, 7, 28), 80));
        input.add(new Human(18, "Qq", "Ff", LocalDate.of(1934, 8, 28), 100));
        input.add(new Human(68, "Tt", "Pp", LocalDate.of(1988, 10, 18), 40));
        input.add(new Human(99, "Yy", "Oo", LocalDate.of(1904, 6, 11), 98));
        input.add(new Human(30, "Vv", "Ll", LocalDate.of(1954, 3, 20), 150));
        Stream<Human> stream = input.stream();
        stream.filter(human -> human.getWeight() > human.getAge())
        .sorted(Comparator.comparing(Human::getLastName).reversed()).forEach(System.out::println);
        Stream<Human> stream1 = input.stream();
        System.out.println(stream1.map(x -> x.getWeight()).reduce(0, Integer::sum));
    }
}
