package com.Assignment.Day3;

import java.util.Scanner;
import java.lang.Math;
import java.util.Objects;

public class lineComparision {

    public static void main(String[] args) {

        int x1, x2, y1, y2;
        double length1;
        int p1 , p2, q1, q2;
        double length2;
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

        System.out.print("Enter p1 point : ");
        p1 = sc.nextInt();
        System.out.print("Enter p2 point : ");
        p2 = sc.nextInt();
        System.out.print("Enter q1 point : ");
        q1 = sc.nextInt();
        System.out.print("Enter q2 point : ");
        q2 = sc.nextInt();

        System.out.println(" ");
        double diff_P = p2 - p1;
        double diff_Q = q2 - q1;
        length2 = Math.sqrt(( Math.pow(diff_P, 2 ) + Math.pow( diff_Q, 2 )));
        System.out.println("Length of the Line-2 :"+length2);

        if (Objects.equals(length1,length2)) {
            System.out.println("Both line 1 and 2 are equal");
        }
        else{
            System.out.println(("Lines are not equal"));
        }

        String length1_str = String.valueOf(length1);
        String length2_str = String.valueOf(length2);

        int length_Compare = length1_str.compareTo(length2_str);
        if (length_Compare == 0) {
            System.out.println("The both lines are equal ");
        }       else if (length_Compare > 0) {
                    System.out.println("The lines 1 is greater than line 2");
                }       else
                            System.out.println("The line 2 is greater than line 1");
    }
}
