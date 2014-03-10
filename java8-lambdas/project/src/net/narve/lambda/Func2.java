package net.narve.lambda;

public abstract class Func2 {

    public void println(String s) {
        System.out.println(s);
    }

    public abstract String toString();

    public String doitImpl() {
        return "wtf?";
    }

    public abstract String doitAbst();
}
