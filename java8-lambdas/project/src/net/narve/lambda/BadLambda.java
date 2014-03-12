package net.narve.lambda;

import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class BadLambda {

    static void method( Predicate<Integer> p ) {
        System.out.println("Method a");
    }

    static void method( Function<Integer, Integer> p ) {
        System.out.println("Method b");
    }

//    static void method( Function<Integer, String> p ) {
//        System.out.println("Method b");
//    }

    static void method( BiFunction<Integer, Integer, Integer> p ) {
        System.out.println("Method c");
    }

    static void method( Runnable al ) {
        System.out.println("Method d");
    }

    static void method( Callable al ) {
        System.out.println("Method e");
    }

    public static void main( String ... args ) {
        //method( i -> i%2==0);
        //method( i -> true);

        method( (i, j ) -> i*j);

        method( (Predicate<Integer>) (i -> i%2==0));

        method( (Function<Integer, Integer>) (i -> i%2));

        method( () -> 1 );

        method( () -> {} );

    }

}
