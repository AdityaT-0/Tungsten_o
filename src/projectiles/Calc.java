package projectiles;
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
	//Code starts here	
		
		
		//VAriables
		Scanner sc = new Scanner(System.in);
		int exit = 0;
		int input1 = 0;
		int input2 = 0;
		double sum = 0;
		
		//processing
		//not equal to (!=),greater than(>),Less than(<),equals(==)
		while(exit != 5) {
			System.out.println("Enter 1 for Addition");
			System.out.println("Enter 2 for Subtraction");
			System.out.println("Enter 3 for Multiplication");
			System.out.println("Enter 4 for Division");
			System.out.println("Enter 5 to exit");
			
			exit = sc.nextInt();
			
			switch(exit) {
				case 1:
					System.out.println("Enter first integer");
					input1 = sc.nextInt();
					
					System.out.println("Enter second integer");
					input2 = sc.nextInt();
					
					sum = input1 + input2;
					System.out.println("Your answer is....");
					System.out.println(sum);
					break;
					
				case 2:
					System.out.println("Enter first integer");
					input1 = sc.nextInt();
					
					System.out.println("Enter second integer");
					input2 = sc.nextInt();
					
					sum = input1 - input2;
					System.out.println("Your answer is....");
					System.out.println(sum);
					break;
				
				case 3:
					System.out.println("Enter first integer");
					input1 = sc.nextInt();
					
					System.out.println("Enter second integer");
					input2 = sc.nextInt();
					
					sum = input1 * input2;
					System.out.println("Your answer is....");
					System.out.println(sum);
					break;
					
				case 4:
					double newInput = 0; 
					double newInput2 = 0;
					
					System.out.println("Enter first integer");
					newInput = sc.nextDouble();
					
					System.out.println("Enter second integer");
					newInput2 = sc.nextDouble();
				 
							
					sum = newInput / newInput2;
					System.out.println("Your answer is....");
					System.out.println(sum);
					break;
					
				case 5:
					break;
						
						
				default:
					System.out.println("Wrong answer bucko");
					break;
			}
			
		}
		System.out.println("You have exited have fun next time!!");		
		
	//code ends here	
	}

}
