import java.util.Scanner;

public class DoubleSelection{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter fullName: ");
		String fullName = scan.nextLine();
		
		System.out.print("Enter Username: ");
		String username = scan.nextLine();
		
		System.out.print("Enter Password: ");
		String password = scan.nextLine();
		
	    if(username.equals("johnnydeep") && password.equals("12345")){
			System.out.println("Access Granted");
			System.out.println(fullName + " you are welcome");
		}
		else{
			System.out.println("Access Denied");
		}
		
	}
}