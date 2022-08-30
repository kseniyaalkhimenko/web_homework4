package org.example;

import static java.lang.Math.sqrt;

public class Triangle {

    public double sTriangle(int a, int b, int c) {

        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            throw new ArithmeticException("Sides values must be positive");
        }
        if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
            throw new ArithmeticException("Can't make a triangle with such sides");
        }

        int p = (a + b + c) / 2; //полупериметр

        double h = (2 * (sqrt(p * (p - a) * (p - b) * (p - c)))) / a; //высота

        return (h * a) / 2; //площадь

    }

}
