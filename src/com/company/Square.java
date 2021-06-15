package com.company;


// P13.2 Given a class Square with instance variable width, provide a recursive getArea method.
// Construct a square whose width is one less than the original and call its getArea nethod.
public class Square {
    int width;

    public Square(int width) {
        this.width = width;
    }

    public int getArea(){
        if(width <= 0) {
            return 0;
        } else if(width == 1) {
            System.out.println("recursion ended because width is = " + width);
            return 1;
        } else {
            Square s = new Square(width -1);

            return s.getArea() + 2 * width -1;
        }
    }
}
