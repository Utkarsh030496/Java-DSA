package test;

public class TestReplace {

	public static void main(String[] args) {
		
		Test test = new Test("^U!t`k~a@r#s*h`~!@#  &", "Employee  ");
		System.out.println(test.getName());
		//System.out.println(test.getType());
		test.setName(test.getName().trim().replaceAll("[\\`\\~\\!\\@\\#\\^\\&\\*]", ""));
		//test.setName(test.getName().trim().replaceAll("h", "hhhh"));
		//test.setType(test.getType().trim().replaceAll("e", "eeee"));
		System.out.println(test.getName());
		//System.out.println(test.getType());
	}

}
