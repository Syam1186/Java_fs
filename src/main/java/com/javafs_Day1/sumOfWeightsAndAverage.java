package com.javafs_Day1;

import java.util.Scanner;

public class sumOfWeightsAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Person Weight:");
        float personweight1 = sc.nextFloat();
        System.out.println("Enter the 2nd Person Weight:");
        float personweight2 = sc.nextFloat();
        System.out.println("Enter the 3rd Person Weight:");
        float personweight3 = sc.nextFloat();
        float sum = personweight1 + personweight2 + personweight3;
        short average = (short) (sum / 3);
        System.out.println("The Sum of Three Weights are" + sum);
        System.out.println("The average of Three Weights are" + average);
    }

}
