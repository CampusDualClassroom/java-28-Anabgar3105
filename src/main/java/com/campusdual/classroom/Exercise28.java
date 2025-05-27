package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise28 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2, 3};
        System.out.println(posArray(arr,3));

    }

    public static int posArray(int[] array,int pos) throws ArrayIndexOutOfBoundsException {
        return array[pos];
    }
}
