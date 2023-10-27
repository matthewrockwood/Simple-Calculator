import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//take input number 
		//then take +-*/
		//then take second number
		Scanner scnr = new Scanner(System.in);
		double firstNum;
		double secondNum;
		char action;
		String quit="y";
		double sum=0;
		
		
		
		
		while (!quit.equals("quit")) {
			
		System.out.println("Enter The First Number:");
		firstNum=scnr.nextInt();
		System.out.println("Enter The Second Number:");
		secondNum=scnr.nextInt();
		System.out.println("Enter +,-,x or /");
		action= scnr.next().charAt(0);
		if(action=='+') {
			sum = firstNum + secondNum;
			
		}
		else if(action=='-') {
			
			sum = firstNum - secondNum;
		}
		else if(action=='x') {
	
			sum = firstNum * secondNum;
		}
		else if(action=='/') {
	
			sum = firstNum / secondNum;
		}
		else {
			
		System.out.print("Not A Valid Charater");
		break;
		}
		
		System.out.println("The total is " + sum);
		System.out.println("Type \"quit\" or hit enter to continue");
		quit = scnr.next();
		
		
		}
		
		
		
	}

}
