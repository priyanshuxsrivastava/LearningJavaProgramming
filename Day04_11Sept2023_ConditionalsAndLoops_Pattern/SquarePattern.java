package pattern;
import java.util.Scanner;
public class SquarePattern {
	public static void main(String[] args0) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=n) {
				System.out.print(n);
				j++;
			}
		i++;
		System.out.println();
		}
		
	}

}
