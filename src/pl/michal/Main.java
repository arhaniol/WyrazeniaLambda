package pl.michal;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 1:");
        task1();
        System.out.println("Zadanie 2:");
        task2();
        System.out.println("Zadanie 3:");
        task3();
    }

    private static void task3() {
        BiFunction<Integer, String, Human> humanFunction = Human::new;
        Human human = humanFunction.apply(34, "Tomasz");
        System.out.print(human.getName()+" ma " + human.getAge() + " lat");
    }

    private static void task2() {
        Object object = new Object();
        Predicate<Object> equalsFunction = object::equals;

        Object object2 = new Object();

        System.out.println(equalsFunction.test(object2));
    }

    private static void task1() {
        List<String> lines = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Insert 4 lines of string:");
        for (int i = 0; i < 4; i++) {
            lines.add(input.nextLine());
        }
        System.out.println("Lines before sorting");
        printLines(lines);

        lines.sort((o1, o2) -> o2.length() - o1.length());

        System.out.println("Lines after sorting");
        printLines(lines);
    }

    private static void printLines(List<String> lines) {
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
