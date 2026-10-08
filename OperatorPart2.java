public class OperatorPart2{
	public static void mian(String[] args)
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
		
		System.out.printf("Is(num1 > num2) && (num1 > num3): %b%n",num1,num2,num3,isAND);
		System.out.printf("Is(num1 > num2) || (num1 > num3): %b%n",num1,num2,num3,isOR);
		System.out.printf("Is!((num1 > num2) || (num1 > num3)): %b%n",num1,num2,num3,isNOT);
		
		
	}
}