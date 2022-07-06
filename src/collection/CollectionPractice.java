package collection;

public class CollectionPractice {

	public static void main(String[] args) {
		String str = "1,1,1,1,2,2,3,4,5";
		String str2 = str.replaceAll(",", "");
		System.out.println(str2);
		int n = Integer.valueOf(str2);
		System.out.println(n);
		int[] ar = new int[str2.length()];
		for(int i=0;i<str2.length();i++){
			ar[i]=n%10;
			n=n/10;
		}
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]>ar[j]){
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
		int[] arr = {1,1,1,1,2,2,3,4,5};
		int[] bool = new int[arr.length];
		
		for(int i=0;i<bool.length;i++)
			bool[i] = 0;
		
		int count = 1;
		
		for(int i=0;i<arr.length;i++){
			count =1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					bool[j]=1;
				}
			}
			if(bool[i]!=1){
				System.out.println("count of "+arr[i]+" is "+count);
				}
		}
	}
}
