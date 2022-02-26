package sortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

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
		insertion(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void insertion(int[] arr) {
		for(int i = 0;i<arr.length-1;i++){
			for(int j = i+1;j>0;j--){
				if( arr[j] < arr[j-1] ){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else
					break;
			}
		}
	}

}
