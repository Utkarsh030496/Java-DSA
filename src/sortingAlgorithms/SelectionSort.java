package sortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void selection(int[] arr){
		//run steps to N-1 passes
		for(int i=0;i<arr.length;i++){
			//find out max item in remaining array
			//swap it with correct index
			int last = arr.length-i-1;
			int maxIndex = getmaxIndex(arr,last);
			swap(arr,maxIndex,last);
				}
			}
		private static void swap(int[] arr, int maxIndex, int last) {
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[last];
			arr[last] = temp;
		
	}
		private static int getmaxIndex(int[] arr, int last) {
			int max = 0;
			for(int i = 0;i<=last;i++){
				if(arr[max]<arr[i])
					max = i;
			}
			return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array after sorting is");
		selection(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
