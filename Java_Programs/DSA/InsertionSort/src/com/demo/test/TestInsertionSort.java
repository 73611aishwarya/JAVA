package com.demo.test;

import java.util.Arrays;

public class TestInsertionSort {

	public static void main(String[] args) {
	int arr[]= {45,34,65,87,62,98,78,28};
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(arr));
		InsertionSort(arr);
		System.out.println("After sorting..");
        System.out.println(Arrays.toString(arr));
	}


	private static void InsertionSort(int [] arr) {
	     int n=arr.length;
	     for(int i=1;i<n;i++) {
	    	int j=i-1;
	    	
	    	int key=arr[i];
	    	while(j>=0 &&arr[j]>key) {
	    		arr[j+1]=arr[j];
	    		j--;
	    	}
	    	arr[j+1]=key;
	    	System.out.println("Iteration:"+i);
	    	System.out.println(Arrays.toString(arr));
	     }
		
	}

}
