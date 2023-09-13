import java.util.Scanner;
public class SimpleInterestCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		System.out.println(str);
		
		char c = str.charAt(0);
		System.out.println(c);
		int p = scan.nextInt();
		int r =scan.nextInt();
		int t =scan.nextInt();
		
		int si = ((p*r*t)/100);
		System.out.println(si);

		
		short s =scan.nextShort();
		long l =scan.nextLong();
		
		float f =scan.nextFloat();
		double d = scan.nextDouble();
		
		
	
	}
}
