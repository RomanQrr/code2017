package ru.omsu.basic;

import java.util.Scanner;

public class SystemEquations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] nums = new double[6];
        for(int i=0; i<nums.length; i++) {
            System.out.println("Input the next number of system of equations:");
            nums[i] = in.nextDouble();
        }
        double delta = (nums[4] * nums[0] - nums[3] * nums[1]);
        if (delta!=0) {
            double x = (nums[5] * nums[0] - nums[3] * nums[2]) / delta;
            double y = (nums[2] * nums[4] - nums[1] * nums[5]) / delta;
            System.out.println("The solution for the system is x = "+x+" and y = "+y );
        }
        else{
            System.out.println("There is no single solution for this system.");
        }
    }
}
