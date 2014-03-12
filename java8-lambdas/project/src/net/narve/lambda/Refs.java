package net.narve.lambda;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;

public class Refs {

    // 1 static
    Comparator<Integer> x1 = Math::max;

    // 2 instance method of current object:
    Function<String, Integer> x2 = String::length;

    // 3 instance method of one specific object:
    String n = "narve";
    Supplier<Integer> x3a = "narve"::length;
    Supplier<Integer> x3b = n::length;

    // 4 Constructor
    Supplier<String> x4a = String::new;
    Supplier<String> x4b = String::new;




}
