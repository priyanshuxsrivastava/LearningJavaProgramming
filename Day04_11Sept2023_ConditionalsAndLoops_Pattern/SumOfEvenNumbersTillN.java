package while_loop;
import java.util.Scanner;
public class SumOfEvenNumbersTillN {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int i =1,sum=0;
		while(i<=n) {
			if(i%2==0) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
