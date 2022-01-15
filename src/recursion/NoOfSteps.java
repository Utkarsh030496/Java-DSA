package recursion;

public class NoOfSteps {

	public static void main(String[] args) {
		System.out.println(Steps(41,0));
	}

	private static int Steps(int n, int i) {
		if(n==0)
			return i;
		
		if(n%2 == 0)
			return Steps(n/2, ++i);
		
		return Steps(n-1, ++i);
	}

}
