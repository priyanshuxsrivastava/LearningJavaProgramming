package pattern;
import java.util.Scanner;
public class TriangularPattern3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		int Counter=1;

		while(i<=n) {
			int j =1;
			while(j<=i) {
				System.out.print(Counter);
				Counter++;
				j++;
			}i++;
			System.out.println();
			}
	}

}
