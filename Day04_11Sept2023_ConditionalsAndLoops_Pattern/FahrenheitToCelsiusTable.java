package while_loop;
import java.util.Scanner;
public class FahrenheitToCelsiusTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int S= scan.nextInt();
		int E =scan.nextInt();
		int W=scan.nextInt();
		
		if((0<=S&&S<=90) || (S<=E&&E<=900) || (0<=W&&W<=80)) {
			
			while(S<=E) {
				
				int cel= (int)((5.0/9)*(S-32));
				System.out.println(S+" "+cel);
				
				S=S+W;
				
			}		
		}else {

			System.out.println("Enter Valid Values");
			return;
		}
		
		
	}
}

