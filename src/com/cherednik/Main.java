package com.cherednik;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(9) + 1;
            }
        }
        printArr(arr);
        sortArr(arr);
        System.out.println("Array after sort");
        printArr(arr);
    }

    public static void printArr(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void sortArr(int[][] arr) {
        int n = arr.length;
        int[] temp = new int[n * n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[k++] = arr[i][j];
            }
        }
        Arrays.sort(temp);
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = temp[k++];
            }
        }
    }
}
