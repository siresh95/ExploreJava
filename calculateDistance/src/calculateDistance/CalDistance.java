package calculateDistance;

import java.util.Scanner;

public class CalDistance {

	public static void main(String[] args) {
		int x1;
		int x2;
		int y1;
		int y2;
		double Dis;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x1 point");
		x1=sc.nextInt();
		System.out.println("enter x2 point");
		x2=sc.nextInt();
		System.out.println("enter y1 point");
		y1=sc.nextInt();
		System.out.println("enter y2 point");
		y2=sc.nextInt();
		Dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("distance between points=" +Dis);
		
		
	}

}
