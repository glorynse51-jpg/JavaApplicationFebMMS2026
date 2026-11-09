import java.util.Random;

public class UsingRandomClass{
	public static void main(String[] args){
		
		Random rand = new Random();
		
		int num1 = rand.nextLine();
		
		System.out.println("-------------------------------");
		
		System.out.printf("The generated number is %d%n",num1);
		System.out.println("-------------------------------");
	}
}
		