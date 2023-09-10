package while_loop;
import java.util.Scanner;
public class Print1ToN {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int i = 1;
		
		while(i<=n) {
			System.out.println(i);
			i = i+1;
		}
	}

}
