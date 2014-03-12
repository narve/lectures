package net.narve.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Predicates {
    static Stream<Integer> ints() {
        return asList(0, 32, 43, 12, 342, 234234).stream();
    }

    public static void print(Stream s) {
        System.out.println(s.collect(Collectors.toList()));
    }

    public static void main(String... args) {

        print(ints().map(i -> i * i));

        print(ints().map(i -> Math.pow(i, 4)));

        print(ints().map(i -> i%2==0));

        print(ints().filter(i -> i % 2 == 0));

        ints().forEach(i -> System.out.println( i + " og så "));

        ints().map( i -> i + " og så ").forEach( s -> System.out.println( s ));



    }

}
