package calculateDistance;

import java.util.Scanner;

public class EqualityOfTwoLines {

	public static void main(String[] args) {
		int x1;
		int x2;
		int y1;
		int y2;
		int x3;
		int x4;
		int y3;
		int y4;
		double Dis1;
		double Dis2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x1 point");
		x1=sc.nextInt();
		System.out.println("enter x2 point");
		x2=sc.nextInt();
		System.out.println("enter y1 point");
		y1=sc.nextInt();
		System.out.println("enter y2 point");
		y2=sc.nextInt();
		System.out.println("enter x3 point");
		x3=sc.nextInt();
		System.out.println("enter x4 point");
		x4=sc.nextInt();
		System.out.println("enter y3 point");
		y3=sc.nextInt();
		System.out.println("enter y4 point");
		y4=sc.nextInt();
		Dis1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("distance between points=" +Dis1);
		Dis2=Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
		System.out.println("distance between points=" +Dis2);
		if(Dis1== Dis2)
		{System.out.println("legth of both lines are equal");
		
		}
		else {
			System.out.println("length of both lines are not equal");
		}
		
	}

}