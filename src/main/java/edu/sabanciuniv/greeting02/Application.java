package edu.sabanciuniv.greeting02;

public class Application {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.println(args[0]);
        }
    }
}
