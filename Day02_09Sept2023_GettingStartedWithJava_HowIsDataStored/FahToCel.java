import java.util.Scanner;

public class FahToCel {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int fah = scan.nextInt();
		//int cel=(5/9)*(fah-32);
	int cel = ((5*(fah-32))/9);
		cel = (int)((5.0/9)*(fah-32));
		System.out.println(cel);
		
		System.out.println(9/5);
		System.out.println(9.0/5);
		
		System.out.println(9+5);
		System.out.println(9-5);
		System.out.println(9/5);
		System.out.println(9*5);
		
		System.out.println('a'/3);
		
		System.out.println(9%5);
		
		char c = 'a';
		char i = (char)(c + 3);
		System.out.println(i);
		
		System.out.println('a' + 'b');
	}
}
