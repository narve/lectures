package net.narve.lambda;

import static java.util.Arrays.asList;

public class NotAnon2 {

    public NotAnon2() {
    }

    String greeting;

    public static void main( String ... args ) {
        NotAnon2 notAnon2 = new NotAnon2();
        notAnon2.greeting  = "Hi from non-static stuff";
        notAnon2.doit();
    }

    void doit() {
        Runnable r = () -> System.out.println( greeting);
        r.run();
    }

}
