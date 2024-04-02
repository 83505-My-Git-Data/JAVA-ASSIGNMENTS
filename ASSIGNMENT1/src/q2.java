import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 Numbers: ");
		
		
		if(sc.hasNextDouble())
		{
			double num1= sc.nextDouble();
		    double num2= sc.nextDouble();
			
			System.out.println("Avrage of two numbers :"+(num1+num2)/2);
		}
		else {
			System.out.println("The Entered Values are not of double type");
		}
		
		
		

	}

}
