package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Point x1: ");
		double x1 = sc.nextDouble();
		System.out.print("Enter the Point y1: ");
		double y1 = sc.nextDouble();

		System.out.print("Enter the Point x2: ");
		double x2 = sc.nextDouble();
		System.out.print("Enter the Point y2: ");
		double y2 = sc.nextDouble();
		
		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);
		
		
		if(p1.isEqual(p2))
		{
			System.out.println("The Point P1: "+ p1.getDetails() + " & Point P2: " + p2.getDetails() + " are same!");
		}
		else {
			 System.out.println("The Distance Between Points P1: "+ p1.getDetails() + " &  P2: " + p2.getDetails() + " is "+p1.calcualateDistance(p2)); 
		}
		

	}

}
