package com.company;


// Voorbeeld uit het boek
public class Triangle {
    int width;


    public Triangle(int width) {
        this.width = width;
    }

    public int getArea() {
        if(width <= 0) {
            return 0;
        } else if(width == 1) {
            return 1;
        } else {
            Triangle smallerTriangle = new Triangle(width - 1);
            int smallerArea = smallerTriangle.getArea(); // eerst uitrekenen voor width - 1; wachten voor width
            return smallerArea + width;
        }
    }
}
