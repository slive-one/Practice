package com.java.study;

public class Rectangle {
    public static void main(String[] args) {

        int ax1 = 1, ay1 = 1, bx1 = 5, by1 = 5;
        int ax2 = 4, ay2 = 4, bx2 = 7, by2 = 7;

        if (ax2 > bx1 | ay2 > by1 | ax1 > bx2 | ay1 > by2) {
            System.out.println("Не перетинаються");
        } else {
            if ((ax2 == bx1 & ay2 == by1) | (ax1 == bx2 & ay1 == by2) | (ax1 == bx2 & ay2 == by1) | (ax2 == bx1 & ay1 == by2)) {
                System.out.println("Точка перетину - крапка");
            } else {
                if (ax2 == bx1 | ax1 == bx2) {
                    System.out.println("Точка перетину - вертикальна лінія");
                } else {
                    if (ay2 == by1 | ay1 == by2) {
                        System.out.println("Точка перетину - горизонтальна лінія");
                    } else {
                        System.out.println("Точка перетину - прямокутник");
                    }
                }
            }
        }
    }
}
