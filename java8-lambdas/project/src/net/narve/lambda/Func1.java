package net.narve.lambda;

@FunctionalInterface
public interface Func1 {
    String toString();

    void doit();

    default void log( String s) {
        System.out.println( s );
    }

    static void staticLog( String s ) {
        System.out.println("Static log: " + s );
    }

}
