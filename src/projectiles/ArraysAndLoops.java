package projectiles;
import java.util.Scanner; 
public class ArraysAndLoops {

	public static void main(String[] args) {
		   Scanner sc = new Scanner (System.in);
	        
	        int[ ] numbers = new int [10];
	        int total = 0;
	        
	        System.out.println("Enter ten integers and they will be added together:");

	 
	        for (int i=0; i<10; i++)  {

	             numbers[i] = sc.nextInt();
	        }
	        

	        for (int i = 0; i < 10; i++)  {

	             total = total + numbers[i];
	        }
	        
	        System.out.println("The sum of those numbers is:");
	        System.out.println(total);
		
		
		
		
		
		
		
		//loops 
		//for loop 
		//to print numbers 0-10
		
		for(int i = 0; i<11; i++) {
			System.out.println(i);
		}
		
		//while loop 
		
		int n = 2;
	 
		while (n<10) {
			 
			System.out.println(n); 
			n = n+1;
		}
		
		//do while
		int j = 7;

		do {
			j = j-1;
			System.out.println(j); 
			
		}while (j>=4);
		
	}

}
