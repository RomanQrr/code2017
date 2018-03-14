package ru.omsu.basic;

import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] nums = new double[2];
        System.out.println("Input x for Exp(x):");
        nums[0] = in.nextDouble();
        System.out.println("Input the accuracy:");
        nums[1] = in.nextDouble();
        double exp = 0;
        double nextStep = 1;
        int i = 1;
        while (nextStep>nums[1]){
            exp = exp + nextStep;
            i++;
            nextStep *= nums[0]/i;
        }
        System.out.println("The exponent of "+nums[0]+" is "+exp);
    }
}
