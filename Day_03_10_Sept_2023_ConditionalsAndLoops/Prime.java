package while_loop;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = 2;
		while(d<n) {
			if (n%d==0) {
				System.out.println("Not a Prime");
				return;
			}
			d =d +1;
			}
	System.out.println("Prime");		
		}
	}

