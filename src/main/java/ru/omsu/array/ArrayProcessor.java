package ru.omsu.array;

import java.util.Scanner;

public class ArrayProcessor {
    public static void outputArray(int[] input){
        for(int i = 0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
    }
    public static void inputArray(int[] array){
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<array.length;i++){
            array[i] = in.nextInt();
        }
    }
    public static int sum(int[] input){
        int sum = 0;
        for(int i = 0; i < input.length; i++){
            sum = sum + input[i];
        }
        return sum;
    }
    public static int even(int[] input){
        int count = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static int segment(int[] input,int a, int b){
        int count = 0;
        for (int i = 0; i < input.length; i++){
            if(input[i]>=a && input[i]<=b){
                count++;
            }
        }
        return count;
    }
    public static boolean positive(int[] input){
        for (int i = 0; i < input.length; i++){
            if (input[i]<=0){
                return false;
            }
        }
        return true;
    }
    public static void reverse(int[] input){
        for (int i = 0; i < input.length / 2; i++){
            int bub = input[i];
            input[i] = input[input.length-i-1];
            input[input.length-i-1] = bub;
        }
    }
}
