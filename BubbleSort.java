package org.example;

import java.util.Scanner;

public class BubbleSort
{
    public static void bubble(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<= arr.length-1;j++)
            {
                if(arr[j]>arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        bubble(arr);
    }
}
