package task1;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> predicate = a -> a.length() == 4 || a.length() == 6;
        System.out.println(predicate.test("1234"));
        System.out.println(predicate.test("12345"));
        System.out.println(predicate.test("123456"));
    }
}
