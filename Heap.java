package org.example;
import java.util.*;
public class Heap
{
    public static void heapSort(int arr[])
    {
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
        for(int i=n-1;i>0;i--)
        {
            swap(arr,0,i);
            heapify(arr,i,0);

        }
    }
    public static void heapify(int arr[],int n,int i)
    {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left]>arr[largest])
        {
            largest=left;
        }
        if(right<n && arr[right]>arr[largest])
        {
            largest=right;
        }
        if(largest!=i)
        {
            swap(arr,i,largest);
            heapify(arr,n,largest);
        }
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        System.out.println("ENTER NO OF ELEMENTS IN ARRAY");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        heapSort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
