package net.narve.lambda;

@FunctionalInterface
public interface Func1 {
    String toString();

    void doit();

    default void println( String s) {
        System.out.println( s );
    }

}
