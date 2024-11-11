package com.demo.test;

import java.util.Arrays;

public class TestSelectionSort {

	public static void main(String[] args) {
	int []arr= {45,67,32,23,12,72,89,27,10,2};
	System.out.println("Array before Sorting....");
	System.out.println(Arrays.toString(arr));
	
	SelectionSort(arr);
	
	System.out.println("Array After Sorting.....");
	System.out.println(Arrays.toString(arr));
		
	}

	private static void SelectionSort(int[] arr) {
	int n=arr.length-1;
	for(int i=0;i<n;i++)
	{
		int min_index=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[min_index]) {
			min_index=j;
			}
		}
		
		int temp=arr[i];
		arr[i]=arr[min_index];
		arr[min_index]=temp;
		System.out.println("minimum index:"+arr[i]+"======"+arr[min_index]);
		System.out.println(Arrays.toString(arr));
		
	}
		
	}

}
