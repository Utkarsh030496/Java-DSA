package questions;

import java.util.*;

public class MaxInt {
	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int max = Math.max(c,(Math.max(a, b)));
		
		System.out.println(max);
		
		sc.close();
		
	}
}
