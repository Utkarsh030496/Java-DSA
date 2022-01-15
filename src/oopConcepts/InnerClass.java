package oopConcepts;

public class InnerClass {
	
	//this class is static and it doesn't need the InnerClass object to be created to be initalized
	//but inside the class its objects will have their own identity
	//so they will have their own value
    static class Test {
         String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Utkarsh");
        Test b = new Test("Harshita");

        System.out.println(a);
        System.out.println(b);
        
//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}
