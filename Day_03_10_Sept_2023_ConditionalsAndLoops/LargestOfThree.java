package if_else;
import java.util.Scanner;
public class LargestOfThree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b =scan.nextInt();
		int c = scan.nextInt();
		
		/*if(a>=b && a >=c) {
			System.out.println(a);
		}else {
			if(b>=c && b>=a) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}*/
	
		if(a>=b && a>=c) {
			System.out.println(a);
			
		}else if(b>=c && b>=a) {
			System.out.println(b);
		}else{
			System.out.println(c);
	
	
	
	}
	
	}
}
