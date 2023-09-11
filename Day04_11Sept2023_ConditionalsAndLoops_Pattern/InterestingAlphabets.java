package pattern;
import java.util.Scanner;
public class InterestingAlphabets {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		while(i<=n) {
			int j =1;
			while(j<=i) {
				System.out.print((char)('A'+n-i+j-1));
				j++;
			}i++;
			System.out.println();
			}
	}

}
