import java.util.Scanner;







public class Main {

	
	
	
	
	public static void main(String[] args) {
		
		Scanner keyedInput = new Scanner(System.in);
		
		
		
		double weightKG;
		double weightLB;
 		
		
		
		
		
		System.out.print ("enter your wheight in kilo: ");
		weightKG = keyedInput.nextDouble();
		
		weightLB = weightKG * 2.2;
		
		System.out.println (weightKG + " kilograms is equal to " + weightLB + " pounds");
	
		 
	}
	
	
}
