package org.saddy.practice;

import java.util.Arrays;

public class ArrayPractice {
    public static int[] array = new int[]{-10, 20, 30, -40, -50, 60, 70, -80, -90};
    public static int[] array1 = new int[3];
    public static int[] array2 = new int[3];
    public static int[] array3 = new int[3];

    public static void main(String[] args) {
        int index1 =0;
        int index2 =0;
        int index3 =0;
        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
                array1[index1++] = array[i];
            } else if (i % 3 == 1) {
                array2[index2++] = array[i];
            } else {
                array3[index3++] = array[i];
            }
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }
}


/*
Write a program that evenly distributes the elements of the array named array among the array1, array2 and array3 arrays according to the following rule:

0th element in array1, 1st -> array2, 2nd -> array3, 3rd -> array1, etc.

Requirements:
•	The program must not read anything from the keyboard.
•	The program must evenly distribute elements of the array array to array1, array2 and array3 arrays.

*/
