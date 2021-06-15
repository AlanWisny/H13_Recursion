package com.company;


import java.util.Objects;

// P15.18 A labeled point has x- and y-coordinates and a string label.
// Provide a class with a constructor LabeledPoint(int x, int y, String label), HashCode and Equals methods.
// Two labeled points are considered the same when they have the same location and label.
public class LabeledPoint {
    private Coordinates coords;
    private String label;

    public LabeledPoint(int x, int y, String label) {
        this.coords = new Coordinates(x, y);
        this.label = label;
    }

    @Override
    public int hashCode() {
        return this.coords.hashCode() + this.label.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // (obj instanceof LabeledPoint) {
        //  LabeledPoint theObject = (LabeledPoint) obj;
        //  return this.equals(theObject);
        //




        LabeledPoint labp = (LabeledPoint) obj;
        Coordinates c = (Coordinates) labp.coords;
        return coords.equals(c) && label.equals(labp.label);
    }


    public String getLabel() {
        return label;
    }

    public class Coordinates {
        private int x;
        private int y;

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 31 * hash + Objects.hashCode(this);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            Coordinates co = (Coordinates) obj;
            if (this.x == co.getX() && this.y == co.getY()) {
                return (this.x == co.getX() && this.y == co.getY());
            }
            return false;
        }

        public int getY() {
            return y;
        }
    }
}
