import java.util.Scanner;







public class Main {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner keyedInput = new Scanner(System.in);
		
		
		
		double hours;
		double rate;
		
		
		
		
		
		System.out.print ("money per hour: ");
		rate = keyedInput.nextDouble();
		System.out.print ("hours worked: ");
		hours = keyedInput.nextDouble();

		
		
		
		
		
		System.out.println (rate * hours);
	
		 
	}
	
	
}
