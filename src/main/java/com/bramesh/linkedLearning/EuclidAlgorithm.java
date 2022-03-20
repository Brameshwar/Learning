package com.bramesh.linkedLearning;

public class EuclidAlgorithm {

        // Euclidean Algorithm

        public static int gcd(int a, int b)
        {
            System.out.println("a"+a+"b"+b);

            if (a == 0)
                return b;
            System.out.println("b%a: "+b%a+" & b/a: "+b/a);
            return gcd(b%a, a);
        }

        public static void main(String[] args)
        {
            int a = 15, b = 10, g;
            g = gcd(a, b);
            System.out.println("GCD(" + a + " , " + b+ ") = " + g);

        }
    }
