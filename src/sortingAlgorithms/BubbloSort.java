package sortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbloSort {
	
	public static void bubble(int[] arr){
		boolean swap;
		//run steps to N-1 passes
		for(int i=0;i<arr.length;i++){
			swap = false;
			//for each step/pass maximum item will go to the last index
			for(int j=1;j<arr.length-i;j++){
				//swap if item is smaller than item to its left
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swap = true;
				}
			}
			//if we do not swap for a value of if 
			//it means that array is sorted
			if(swap = false){
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
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
		bubble(arr);
		sc.close();
	}

}
