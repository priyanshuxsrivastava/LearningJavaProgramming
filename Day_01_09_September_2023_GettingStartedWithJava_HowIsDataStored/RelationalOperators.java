import java.util.Scanner;
public class RelationalOperators {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		boolean iseq = (i ==j);
		boolean neq = (i!=j);
		boolean isgr = (i>j);
		boolean isgreq = (i>=j);
		boolean isless = (i<j);
		boolean islesseq = (i<=j);
		System.out.println(iseq);
		System.out.println(neq);
		System.out.println(isgr);
		System.out.println(isgreq);
		System.out.println(isless);
		System.out.println(islesseq);
		
	}
}
