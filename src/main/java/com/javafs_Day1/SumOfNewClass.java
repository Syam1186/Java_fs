package com.javafs_Day1;

import java.util.Scanner;

public class SumOfNewClass {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int n1 = sc.nextInt();
        System.out.println("Enter the Second Number");
        int n2 = sc.nextInt();
        int add = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + add);
    }
}
