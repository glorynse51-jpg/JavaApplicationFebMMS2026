public class ClassWork{
	public static void main(String[] args){
		CheckAge(26);
		CheckAge(17);
		CheckAge(18);
		CheckAge(21);
		CheckAge(30);
		CheckAge(15);
	}
	
    public static void checkAge(int age){
	    if (age >= 18){
		    System.out.println("You are an Adult");
		}
		else{
			System.out.println("You are still a minor");
		}
	}
}
		 
		 
		 
			