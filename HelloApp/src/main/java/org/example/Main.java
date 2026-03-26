package org.example;

public class Main {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();

        if (args.length == 0) {
            nameBuilder.append("World");
        } else {
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
        }

        String name = nameBuilder.toString();
        System.out.println("Hello " + name);
    }
}