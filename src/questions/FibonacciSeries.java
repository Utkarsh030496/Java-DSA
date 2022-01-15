package questions;

import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int n;
		int count = 2;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(;count<=n;count++)
		{
			temp = b;
			b = b+a;
			a = temp;
		}
		
		System.out.println(b);
		
		sc.close();

	}

}
