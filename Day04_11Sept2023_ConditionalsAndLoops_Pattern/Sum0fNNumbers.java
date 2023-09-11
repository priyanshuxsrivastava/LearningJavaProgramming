package while_loop;
import java.util.Scanner;
public class Sum0fNNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		
		int i =1;
		int sum=0;
		
		while(i<=n) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);
	}
}
