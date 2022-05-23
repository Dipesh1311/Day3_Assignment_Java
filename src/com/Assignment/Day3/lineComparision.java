package com.Assignment.Day3;

import java.util.Scanner;
import java.lang.Math;

public class lineComparision {

    public static void main(String[] args) {

        int x1, x2, y1, y2;
        double length1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 point : ");
        x1 = sc.nextInt();
        System.out.print("Enter x2 point : ");
        x2 = sc.nextInt();
        System.out.print("Enter y1 point : ");
        y1 = sc.nextInt();
        System.out.print("Enter y2 point : ");
        y2 = sc.nextInt();

        System.out.println(" ");
        double diff_X = x2 - x1;
        double diff_Y = y2 - y1;
        length1 = Math.sqrt((Math.pow(diff_X, 2) + Math.pow(diff_Y, 2)));
        System.out.println("Length of the Line-1 :"+length1);
    }
}
