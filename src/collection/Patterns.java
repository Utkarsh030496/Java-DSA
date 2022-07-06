package collection;

public class Patterns {
	
	//Steps
	//1. Run the outer for loop number of times the number of rows
	//2. Identify for every row number how many columns are there
	//   or types of elements in the column 
	//3. What do you need to print
	
	public static void main(String[] args) {
		//pattern1(5);
		//pattern2(5);
		//pattern3(5);
		//pattern4(5);
		//pattern5(5);
	}

	private static void pattern5(int n) {
		for(int i=0;i<2*n;i++){
			int row = i>n?2*n-i:i;
			for (int j=0;j<row;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern4(int n) {
		for(int i=1;i<n+1;i++){
			for (int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

	private static void pattern3(int n) {
		for(int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void pattern2(int n) {
		for(int i=0;i<n;i++){
			for (int j=0;j<n-i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void pattern1(int n) {
		for(int i=0;i<n;i++){
			for (int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
