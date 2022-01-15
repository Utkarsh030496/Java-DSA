package recursion;

import java.util.ArrayList;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,9,9,9};
		int target = 9;
		ArrayList<Integer> ar = new ArrayList<>();
		System.out.println(linear(arr,0,target));
		//linear2(arr,0,target,ar);
		System.out.println(linear2(arr,0,target,ar));
		System.out.println(linear3(arr,0,target));
		//System.out.println(ar);
	}
	
	private static ArrayList<Integer> linear3(int[] arr, int index, int target) {
		ArrayList<Integer> ar = new ArrayList<>();
		
		if(index == arr.length)
			return ar;
		
		//this will contain answer for that function call only
		if(arr[index] == target)
			ar.add(index);
		
		ArrayList<Integer> answerfromBelowCalls =  linear3(arr, index+1,target);
		
		ar.addAll(answerfromBelowCalls);
		
		return ar;
	}

	private static ArrayList<Integer> linear2(int[] arr, int index, int target,
			ArrayList<Integer> ar) {
		if(index == arr.length)
			return ar;
		
		if(arr[index] == target)
			ar.add(index);
		
		return linear2(arr, index+1,target,ar);
	}

	private static boolean linear(int[] arr, int index, int target) {
		if(index == arr.length)
			return false;
		
		return arr[index] == target || linear(arr, index+1,target);
	}

}
