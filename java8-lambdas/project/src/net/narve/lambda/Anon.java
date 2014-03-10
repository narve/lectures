package net.narve.lambda;

public class Anon {

    public static void main( String ... args ) {
        String greeting = "Hi from anonymous class";
        Runnable r = new Runnable() {
            public void run() {
                System.out.println(greeting);
            }
        };
        r.run();
    }

}
