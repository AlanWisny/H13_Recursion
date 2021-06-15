package com.company;


// P13.1 Given a class Rectangle with instance variables width and height, provide a recursive getArea method.
// Construct a rectangle whose width is one less than the original and call its getArea method.
public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        if(width <= 0) {
            return 0;
        } else if(width == 1) {
            System.out.println("recursion ended because width is = " + width);
            return height;
        } else {
            Rectangle smallerRect = new Rectangle(width -1, height);
//            System.out.println("1====================1 " + width);

//            int smallerArea = smallerRect.getArea();
//            System.out.println("width is now "+width);
//            System.out.println("2====================2");


//            System.out.println("smallerArea + width is now " + smallerArea +" + " + width);
//            System.out.println("3====================3");
            return height + smallerRect.getArea();
        }
    }

}
