package questions;

public class DigitOccurances {

	public static void main(String[] args) {
		
		int a = 112345;
		int count = 0;
		
		while(a!=0)
		{
			int temp = a%10;
			if(temp==6)
			{
				count++;
			}
			a = a/10;
		}
		
		System.out.println(count);

	}

}
