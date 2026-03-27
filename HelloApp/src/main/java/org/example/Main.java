package org.example;

public class Main {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }

        // Handle default case (no arguments)
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            System.out.println("Hello " + nameBuilder.toString());
        }
    }
}