package pattern;
import java.util.Scanner;
public class SquarePattern2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =  scan.nextInt();
		int i =1;
		while(i<=n) {
			int j =0;
			while(j<=n) {
				System.out.print(i);
				j++;
			}i++;
			System.out.println();		}
	}
}
