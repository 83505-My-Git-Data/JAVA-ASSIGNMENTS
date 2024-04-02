import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int quantity;
		double totalBill = 0.0;
		double dosa = 10;
		double samosa = 20;
		double idli = 30;
		double pizza = 40;
		
		do {
		
		System.out.println("***Welcome to Food Counter***");
		System.out.println("1. Dosa: ");
		System.out.println("2. Samosa: ");
		System.out.println("3. Idli: ");
		System.out.println("4. Pizza: ");
		System.out.println("5. Generate Bill: ");
		System.out.println("Enter Your Choice: ");
		choice = sc.nextInt();

		switch(choice)
		{
		case 0: 
			System.out.println("Thankyou For Visiting!");
			break;
		case 1: 
			System.out.print("Enter the number of Dosa's: ");
			quantity = sc.nextInt();
			totalBill = totalBill + quantity * dosa;
			break;
			
		case 2: 
			System.out.print("Enter the number of Samosa's: ");
			quantity = sc.nextInt();
			totalBill = totalBill + quantity * samosa;
			break;
			
		case 3: 
			System.out.print("Enter the number of Idli's: ");
			quantity = sc.nextInt();
			totalBill = totalBill + quantity * idli;
			break;
			
		case 4: 
			System.out.print("Enter the number of Pizza's: ");
			quantity = sc.nextInt();
			totalBill = totalBill + quantity * pizza;
			break;
			
		case 5:
			System.out.println("The Total Bill is: " + totalBill);
			break;
			
		default:
			System.out.println("Invalid Item added");
			break;
		}
		

		}while(choice!=0);
		
	}

}
