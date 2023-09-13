package if_else;
import java.util.Scanner;
public class FindCharacterCase {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char c = scan.next().charAt(0);
		
		if(c>='A' && c<='Z') {
			System.out.println("1");
		} else if(c>='a' && c<='z') {
			System.out.println("0");
		}else {
			System.out.println("-1");
		}
	}
}
