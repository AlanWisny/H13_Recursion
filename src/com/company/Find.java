package com.company;

public class Find {
    public Find() {
    }

    public static boolean find(String text, String str) {
        if(text.length() < str.length()) {
            return false;
        } else if (text.substring(0, str.length()).equals(str)) {
            return true;
        } else {
            return find(text.substring(1), str);
        }
    }

    public static boolean indexOf(String text, String str, int foundAt) {
        if(text.length() < str.length()) {
            return false;
        } else if (text.substring(0, str.length()).equals(str)) {
            System.out.println("Found at index of: " + foundAt);
            return true;
        } else {
            return indexOf(text.substring(1), str, foundAt+1);
        }
    }
}
