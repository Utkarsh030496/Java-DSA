package oopConcepts;

public class SingletonClass {
    private SingletonClass () {

    }

    private static SingletonClass instance;

    public static SingletonClass getInstance() {
        // check whether 1 obj only is created or not
        if (instance == null) {
            instance = new SingletonClass();
        }

        return instance;
    }
    
    public static void main(String[] args) {
    	SingletonClass obj1 = SingletonClass.getInstance();
    	System.out.println(obj1);

    	SingletonClass obj2 = SingletonClass.getInstance();
    	System.out.println(obj2);

    	SingletonClass obj3 = SingletonClass.getInstance();
    	System.out.println(obj3);
    }

}