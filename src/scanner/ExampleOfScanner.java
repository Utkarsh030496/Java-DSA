package scanner;

import java.util.Scanner;

public class ExampleOfScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println();
		String c = sc.nextLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a+b);
		System.out.println(sc.next());
		sc.close();
		
	}
	
}
