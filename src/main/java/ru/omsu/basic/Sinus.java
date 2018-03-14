package ru.omsu.basic;

import java.util.Scanner;

public class Sinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] nums = new double[3];
        System.out.println("Input left border of tabulation (tabulation will start on it):");
        nums[1] = in.nextDouble();
        System.out.println("Input right border of tabulation:");
        nums[2] = in.nextDouble();
        System.out.println("Input step of tabulation:");
        nums[0] = in.nextDouble();
        double i=nums[1];
        while (i<=nums[2]+nums[0]/2){
            System.out.println("x = "+i+" sin(x)= "+Math.sin(i));
            i += nums[0];
        }
    }
}
