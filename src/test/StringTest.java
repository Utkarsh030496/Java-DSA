package test;

public class StringTest {

	public static void main(String[] args) {
		String s = "hello";
		String t = new String("hello");
		String u = new String("hello");
		System.out.println(u==t);
		System.out.println(s.toString());
		System.out.println(t.toString());
		System.out.println(u.toString());
	}

}
