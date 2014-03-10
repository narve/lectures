package net.narve.lambda;

public class NotAnon {

    public static void main( String ... args ) {
        Runnable r = () -> System.out.println( "Hi from lambda");
        r.run();
    }

}
