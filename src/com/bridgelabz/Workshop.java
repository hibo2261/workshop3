package com.bridgelabz;


import java.util.*;

public class Workshop {
    public static void main(String[] args) {
        int num;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH = ");
        num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("ENTER THE NUMBERS = ");
        for (int i = 0; i < num; i++)
        {
            arr[i] = sc.nextInt();

        }
        System.out.println("NUMBRS IN ARRAY ARE = ");

        for (int i = 0; i < num; i++)
        {
            System.out.println(arr[i]);

        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println();


        System.out.println("ELEMENTS AFTER SORT = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println("2ND POSITION ELEMENT = "+arr[1]);
        System.out.println("2ND BIGGEST ELEMENT = "+arr[num - 2]);

    }
}