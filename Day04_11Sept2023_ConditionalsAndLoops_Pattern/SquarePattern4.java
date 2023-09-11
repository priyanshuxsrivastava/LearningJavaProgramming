package pattern;
import java.util.Scanner;
public class SquarePattern4 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in) ;
	int n = scan.nextInt();
	int i = 1;
	while(i<=n) {
		int j =1;
		while(j<=n) {
			System.out.print(n-j+1);
			j++;
		}i++;
		System.out.println();
	}
	}
}
