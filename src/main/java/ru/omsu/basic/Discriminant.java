package ru.omsu.basic;

import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[] nums = new float[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Input number " + i);
            nums[i] = in.nextFloat();
        }
        float d = nums[1] * nums[1] - 4 * nums[0] * nums[2];
        if(d<0) {
            System.out.println("Equation does not have real roots.");
        }
        else if(d>0) {
            float root1 = (-nums[1]+(float)Math.sqrt(d))/(2*nums[0]);
            float root2 = (-nums[1]-(float)Math.sqrt(d))/(2*nums[0]);
            System.out.println("Equation has 2 real roots: "+root1+" "+root2);
        }
        else {
            float root = -nums[1]/(2*nums[0]);
            System.out.println("Equation has only 1 real root: "+root);
        }
    }
}
