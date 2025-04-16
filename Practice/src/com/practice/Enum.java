package com.practice;

import java.util.Arrays;

enum Operation{
    ADDITION {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUBTRACTION {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICATION {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVISION {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    public abstract double apply(double x, double y);
}

public class Enum {
    public static void main(String[] args) {
        double x = 5;
        double y = 3;
        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
        int[] digits = {1,2,4,3,6};
        int len = digits.length;
        String strArray = Arrays.toString(digits).replaceAll("[\\[\\], ]", "");
        int value = 1+Integer.parseInt(strArray);
        String result = ""+value;
        System.out.println(result.toCharArray());
    }
}
