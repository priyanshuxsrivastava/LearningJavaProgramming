package pattern;
import java.util.Scanner;
public class ReverseNumberPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		while(i<=n) {
			int j =1;
			int StartingNumber=i;
			while(j<=i) {
			//	System.out.print(i-j+1);
				System.out.print(StartingNumber);
				StartingNumber--;
				j++;
			}i++;
			System.out.println();
			}
	}

}
