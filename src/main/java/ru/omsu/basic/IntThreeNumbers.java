package ru.omsu.basic;

import java.util.Scanner;

public class IntThreeNumbers {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i=0; i<3;i++)
        {
            System.out.println("Input number " + i);
            nums[i] = in.nextInt();
        }
        int p = nums[0]*nums[1]*nums[2];
        System.out.println("Product of these numbers = " + p);
        int a = (nums[0]+nums[1]+nums[2])/3;
        System.out.println("Average of there numbers = " + a);
        if(nums[0]>nums[1])
        {
            int bub = nums[0];
            nums[0] = nums[1];
            nums[1] = bub;
        }
        if(nums[0]>nums[2])
        {
            int bub = nums[2];
            nums[2] = nums[1];
            nums[1] = nums[0];
            nums[0] = bub;
        }
        else if(nums[1]>nums[2]){
            int bub = nums[2];
            nums[2] = nums[1];
            nums[1] = bub;
        }
        System.out.println("Numbers in ascending oder: "+nums[0]+" "+nums[1]+" "+ nums[2]);
    }
}
