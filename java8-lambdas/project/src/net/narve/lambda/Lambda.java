package net.narve.lambda;

import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.lang.System.out;
import static java.util.Arrays.asList;

public class Lambda {

    public static int lengthOfStringStatic(String s) {
        return s.length();
    }

    public int lengthOfStringNonStatic(String s) {
        return s.length();
    }


    public static void main( String ... args ) {
        Executor e = Executors.newSingleThreadExecutor();

        e.execute( new Runnable() {
           public void run() {
               out.println( "hallo gamle ørn" );
           }
        });

        e.execute( ()->{} );

        e.execute( ""::length);

        Supplier<String> sup1 = () -> System.getProperty( "asdf" );
        Supplier<String> sup2 = () -> System.getProperty( "asdf" );

        Supplier sup3 = System::getenv;




        ActionListener al1 = (a) -> { out.println("Got action: " + a);};

        ActionListener al2 = a -> { out.println("Got action: " + a);};

        Comparator<String> comp = (String s1, String s2 ) ->
            { return s1.length() - s2.length(); };


        String str = "hi";
        Runnable r1 = () -> { out.println( "Hello lambda" );};
        Runnable r2 = () -> { out.println( str ); };
        Runnable r3 = () -> { str.length(); };
        Runnable r4 = () -> str.length();
        Runnable r5 = str::length;


        Lambda lambda = new Lambda();

        Function<String, Integer> func1 = (String s) -> { return s.length();};
        Function<String, Integer> func2 = (String s) -> s.length();
        Function<String, Integer> func3 = (s) -> s.length();
        Function<String, Integer> func4 = s -> s.length();
        Function<String, Integer> func5 = String::length;
        Function<String, Integer> func6 = Lambda::lengthOfStringStatic;
        Function<String, Integer> func7 = lambda::lengthOfStringNonStatic;

        // Function<String, Integer> func8 = lambda::lengthOfStringStatic;
        // Function<String, Integer> func9 = Lambda::lengthOfStringNonStatic;

        asList( "asdf").stream().map( lambda::lengthOfStringNonStatic );

        // Method m = Lambda::lengthOfStringNonStatic;




        //str = "nåda";

        e.execute(r1);
        e.execute( r2 );

        List<Integer> integers = asList( 1, 2, 3, 4, 5 );

        integers.stream().reduce(0, (i1,i2) -> i1+i2);

        integers.stream().reduce(0, (i1,i2) -> Math.max(i1,i2));

        integers.stream().reduce(0, Math::max);


//        Function<String, Integer> func6 = s -> { s.length();};

        List<List<Integer>> ll = asList( asList( 0, 1 ), asList( 4, 5 ) );
        ll.stream().reduce(new ArrayList(), (k, v) -> { k.add( v.stream().reduce(0, (i1, i2) -> Math.max(i1, i2)) ); return k; } );

        Predicate<String> p1 = s -> s.length()>10;

        Predicate<String> p2 = s -> { if( s.length() > 10 ) return true; else return false; };

        Function<String, Integer> f1 = s -> s.length();


    }

}
