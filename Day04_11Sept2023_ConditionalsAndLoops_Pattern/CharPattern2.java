package pattern;
import java.util.Scanner;
public class CharPattern2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		while(i<=n) {
			int j =1;
			char startingchar= (char)('A' + i -1);
			while(j<=n) {
				//System.out.print((char)('A'+i+j-2));
				System.out.print(startingchar)
;				startingchar=(char)(startingchar +1);
				j++;
			}i++;
			System.out.println();
			}
	}

}
