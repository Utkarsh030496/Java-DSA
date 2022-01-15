package questions;

import java.util.Scanner;

public class SwitchStmt {

	public static void main(String[] args) {
		
//		String fruit;
//		Scanner sc = new Scanner(System.in);
//		fruit = sc.next();
//		
//		
//		//normal switch 
//		switch(fruit){
//		case "mango":
//			System.out.println("king of fruits");
//			break;
//		case "orange":
//			System.out.println("orange fruit");
//			break;
//		default:
//			System.out.println("invalid option");	
//		} 
		
		/*switch(fruit) {
			case "mango" -> System.out.println("king of fruits");
			case "orange" -> System.out.println("orange fruit");
			case "grapes" -> System.out.println("grape fruit");
			default -> System.out.println("invalid option");	
		}*/
		
//		int n=6;
//		
//		switch(n) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("weekdays");
//			break;
//		case 6:
//		case 7:
//			System.out.println("weekends");
//			break;
//		}
		
		//nested switch
		int empID=3;
		String department = "IT";
        switch (empID) {
        case 1:
            System.out.println("Utkarsh");
            break;
        case 2:
            System.out.println("Rahul Rana");
            break;
        case 3:
            System.out.println("Emp Number 3");
            switch (department) {
                case "IT":
                    System.out.println("IT Department");
                    break;
                case "Management":
                    System.out.println("Management Department");
                    break;
                default:
                    System.out.println("No department entered");
            }
            break;
        default:
            System.out.println("Enter correct EmpID");
    }
		//sc.close();
	}

}
