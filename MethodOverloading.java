import java.util.Scanner;

public class MethodOverloading{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.println("PERIMETER OF A SHAPE");
		System.out.println("===========================\n");
		System.out.println("Enter 1. Circle");
		System.out.println("Enter 2. Square");
		System.out.println("Enter 3. Rectangle");
		System.out.println("Enter 0. Exit");
		System.out.println("===========================\n");
		System.out.print("Enter your choice: ");
		int choice = scan.nextInt();
		
		switch(choice){
			case 1:
			        System.out.print("Enter radius: ");
					double radius = scan.nextDouble();
					
					System.out.printf("The circumference of the circle is %.2f%n",shape(radius));
			break;
			
			case 2:
			        System.out.print("Enter length of square ");
					int length = scan.nextInt();
					
					System.out.printf("The perimeter of the square is %d%n ",shape(length));
			break;
			
			case 3:
		            System.out.print("Enter length of the rectangle ");
					int lengthOfRect = scan.nextInt();
					
					System.out.print("Enter breath of the rectangle");
					int breathOfRect = scan.nextInt();
					
					System.out.printf("The perimeter of the rectangle is %d%n",shape(lengthOfRect,breathOfRect));
			break;
			
			default:
			System.out.println("Exiting program............, Good Bye");
		}
		
	}
	
	public static double shape(double r){
		double perimeter = 2*Math.PI*r;
		
		return perimeter;
	}
	public static int shape(int l){
		int perimeter = 4*l;
		
		return perimeter;
	}
	public static int shape(int l, int b){
		int perimeter = 2*(l+b);
		
		return perimeter;
	}
}