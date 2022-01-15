package recursion;

import javax.xml.soap.Node;

public class BinarySearch {
	//Node x;
	public static void main(String[] args) {
		
		int n = 5;
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binarySearch(n, arr, 0, arr.length-1));

	}

	private static int binarySearch(int target, int[] arr, int s, int e) {
		
		if(s>e)
			return -1;
		
		int mid = s + (e - s)/2;
		
		if(arr[mid] == target){
			return mid;
		}
		
		if(target > arr[mid]){
			return binarySearch(target, arr, mid + 1, e);
		}
		
		return binarySearch(target, arr, s, mid - 1);
		
	}

}
