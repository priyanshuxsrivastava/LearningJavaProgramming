import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b= scan.nextInt();
		int c = scan.nextInt();
		
		boolean isAlargest = (a>=b) && (a>=c);
		System.out.println(isAlargest);
		System.out.println(a>=b || a>=c);
		System.out.println(!(a>=b));
		
	}
}
