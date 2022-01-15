package recursion;

public class CountZeros {

	public static void main(String[] args) {
		System.out.println(Zeros(102000,0));
	}
//using static variable:	
//	static int count = 0;
//	private static int Zeros(int n) {
//		if(n==0)
//			return 0;
//		int rem = n%10;
//		if (rem == 0)
//			count ++;
//		Zeros(n/10);
//		return count;
//	}
//without using static variable:	
	private static int Zeros(int n, int i) {
		if(n==0)
			return i;
		int rem = n%10;
		if (rem == 0)
			return Zeros(n/10,++i);
		
		return Zeros(n/10,i);
	}

}
