package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static com.company.Polygon.calculateArea;

public class Main {


    public static void main(String[] args) {
        int[] x = {2, 7, 3, 6, 4, 9};
        int[] y = {3, 4, 5, 1, 7, 3};

        Queue<String> q = new LinkedList<String>();

        Main m = new Main();
//        m.fac(4);
        Triangle t = new Triangle(10);
        int area = t.getArea();
        System.out.println("Area: " + area);
        System.out.println("Expected: 55");

//        Rectangle r = new Rectangle(5, 10);
//        System.out.println("Area of rectangle is: " + r.getArea());
//
//        System.out.println();
//        Square s = new Square(2);
//        System.out.println("Area of square is: " + s.getArea());
//
//        System.out.println();
//        double area = calculateArea(x, y);
//        System.out.println("Area of Polygon is: " + area);
//
//        System.out.println();
//        Find f = new Find();
//        boolean isFound = f.indexOf("Mississippi", "sip", 0);
//        System.out.println(isFound);
//
        System.out.println();
        LabeledPoint point1 = new LabeledPoint(10, 20, "supg");
        LabeledPoint point2 = new LabeledPoint(10, 20, "supg");
        System.out.println(point1.equals(point2));
        System.out.println(point2.equals(point1));


//        String b = "what";
//        for (String s : permutations(b)){
//            System.out.println(s);
//        }

    }

    public static ArrayList<String> permutations(String word) {
        ArrayList<String> result = new ArrayList<String>();

        // The empty string has a single permutations; itself
        if (word.length() == 0) {
            result.add(word);
            return result;
        } else {
            for (int i = 0; i < word.length(); i++) {
                // Form a shorter word by removing the ith character
                String shorter = word.substring(0, i) + word.substring(i + 1);

                // Generate all permutations of the simpler word
                ArrayList<String> shorterPermutations = permutations(shorter);

                // Add the removed char to the front. Each permutation of the simpler word
                for (String s : shorterPermutations) {
                    result.add(word.charAt(i) + s);
                }
            }

        }
        return result;
    }


    // Voorbeeld uit het boek
    public int fac(int n) {
        System.out.println("entree " + n);
        if (n == 0) {
            return 1;
        }

        int tmp = fac(n - 1);
        System.out.println("na anroep n= " + n + " resultaat = " + tmp);
//        System.out.println("nu pas" + n);
        return n * tmp;
    }


}
