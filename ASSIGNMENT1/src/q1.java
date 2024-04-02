import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =  sc.nextInt();
		System.out.println("Number Entered : "+ num);
		System.out.println("Binary Equivalent : " + Integer.toBinaryString(num));
		System.out.println("Octal equivalent : "+ Integer.toOctalString(num));
		System.out.println("Hexadecimal equivalent : "+ Integer.toHexString(num));
		
	}

}
