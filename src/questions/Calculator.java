package questions;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		int ans = 0;
		int a,b;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the operator you want to use!!");
			ch = sc.next().trim().charAt(0);
			if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')
			{
				System.out.println("Enter first number");
				a = sc.nextInt();
				System.out.println("Enter second number");
				b = sc.nextInt();
				if(ch=='+')
				{
					ans = a+b;
				}
				if(ch=='-')
				{
					ans = a-b;
				}
				if(ch=='*')
				{
					ans = a*b;
				}
				if(ch=='/')
				{
					if(b!=0)
						ans = a/b;
					else
						ans = 0;
						System.out.println("divider cannot be zero");
				}
				if(ch=='%')
				{
					ans = a%b;
				}
				System.out.println("The answer is = ");
				System.out.println(ans);
			}
			else if(ch=='x'||ch=='X')
			{
				System.out.println("Taking you out from the calculator");
				break;
			}
			else
			{
				System.out.println("Invalid operation!!");
			}
		}
		
		sc.close();

	}

}
