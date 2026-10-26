// Encryption
import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
        System.out.print("Enter 4-digit number: ");
        int num = in.nextInt();
		
        int d1 = num/1000, d2 = (num/100)%10, d3 = (num/10)%10, d4 = num%10;
		
        d1 = (d1+7)%10; d2 = (d2+7)%10; d3 = (d3+7)%10; d4 = (d4+7)%10;
		
        int encrypted = d3*1000 + d4*100 + d1*10 + d2;
        System.out.println("Encrypted: "+String.format("%04d", encrypted));
    }
}
// Decryption: Reverse it
// To decrypt: swap again, then (digit+3)%10 because (x+7)%10 reversed is (x+3)%10
// e.g., if encrypted is abcd, swap to cdab, then apply +3 mod 10 to each.