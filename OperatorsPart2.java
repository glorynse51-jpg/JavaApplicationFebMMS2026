public class OperatorsPart2{
	public static void main(String[] args)
	{
		//AND
		int num1 = 50;
		int num2 = 80;
		int num3 = 30;
		//AND
		boolean isAND = (num1 > num2) && (num1 > num3);
		
		//OR
		boolean isOR = (num1 > num2) || (num1 > num3);
		//NOT
		boolean isNOT = !((num1 > num2) || (num1 > num3));
		
		System.out.println("----------------------------------------------------------");
		System.out.printf("Is(num1 > num2) && (num1 > num3): %b%n",num1,num2,num3,isAND);
		System.out.printf("Is(num1 > num2) || (num1 > num3): %b%n",num1,num2,num3,isOR);
		System.out.printf("Is!((num1 > num2) || (num1 > num3)): %b%n",num1,num2,num3,isNOT);
		System.out.println("----------------------------------------------------------");
		
		int x = 5;
		int y = 2;
		
		//Decrement
		//pre-increment
		System.out.println("-----------Increment-----------------------------------------------");
		System.out.println("The value of x is " + ++x);
		System.out.println("The value of y is " + y++);
		System.out.println("----------------------------------------------------------");
		
		//post-increment
		System.out.println("----------------------------------------------------------");
		System.out.println("The value of x is " + x++);
		System.out.println("The value of y is " + y++);
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is " + y);
		System.out.println("----------------------------------------------------------");
		
		//Decrement
		//pre-increment
		System.out.println("----------Decrement------------------------------------------------");
		System.out.println("The value of x is " + --x);
		System.out.println("The value of y is " + --y);
		System.out.println("----------------------------------------------------------");
		
		//post-increment
		System.out.println("----------------------------------------------------------");
		System.out.println("The value of x is " + x--);
		System.out.println("The value of y is " + y--);
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is " + y);
		System.out.println("----------------------------------------------------------");
	}
}