package pattern;
import java.util.Scanner;
public class TriangularStarPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		while(i<=n) {
			int j =1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}i++;
			System.out.println();
			}
	}

}
