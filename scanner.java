import java.util.Scanner;



public class UserInput{ 
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---------------------input from user--------------------");
		System.out.print("Enter your name; ");
		String name = scan.nextLine();
		
		System.out.print("Ente your gender: ");
		String gender = scan.next();
		scan.nextline();
		
		System.out.print("Enter your address: ");
		String address = scan.nextLine();
		
		System.out.print("Enter ypour age: ");
		int age = scan.nextInt();
		
		System.out.print(name + "Are you learning java?(true/false): ");
		boolean answer = scan.nextBoolean();
		System.out.println("-----------------------------------------/n");
		
		System.out.printf("Welcome %s to NIIT",name);
		System.out.printf("You are a %s and yoy are living in %s",gender,address);
		System.out.printf("You are %d years old. Nice meeting you%n",age);
		System.out.printf("Wow you said %B. it means that you are a professional Java programmer%n",answer);
	}
}
	

	