package stringPrograms;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Sring: ");
		String s = sc.nextLine();
		
		s.trim();
		
		
		String []ArrofStrings = s.split(" ");
		
		System.out.print("Lenght of the Array: "+ArrofStrings.length);
		


	}

}
