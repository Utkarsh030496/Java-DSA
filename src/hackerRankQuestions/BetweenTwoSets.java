package hackerRankQuestions;

import java.awt.List;
import java.util.ArrayList;

public class BetweenTwoSets {

	public static void main(String[] args) {
		// creating 2 Lists
		ArrayList<Integer> a = new ArrayList();
		ArrayList<Integer> b = new ArrayList();
		a.add(2);
		a.add(4);
		b.add(16);
		b.add(32);
		b.add(96);
		int result = getTotalX(a, b);
		System.out.println(result);
	}

	public static int getTotalX(ArrayList<Integer> a, ArrayList<Integer> b) {
		int result = 0;

	    // Get LCM of all elements of a
	    int lcm = a.get(0);
	    for (Integer integer : a) {
	      lcm = getLCM(lcm, integer);
	    }

	    // Get GCD of all elements of b
	    int gcd = b.get(0);
	    for (Integer integer : b) {
	      gcd = getGCD(gcd, integer);
	    }
	    
	 // Count multiples of lcm that divide the gcd
	    int multiple = 0;
	    while (multiple <= gcd) {
	      multiple += lcm;

	      if (gcd % multiple == 0)
	        result++;
	    }

	    return result;
	    
	}

	public static int getGCD(int n1, int n2) {
		if (n2 == 0) {
		      return n1;
		    }
		    return getGCD(n2, n1 % n2);
	}

	public static int getLCM(int n1, int n2) {
		if (n1 == 0 || n2 == 0)
		      return 0;
		    else {
		      int gcd = getGCD(n1, n2);
		      return Math.abs(n1 * n2) / gcd;
		    }
	}

}
