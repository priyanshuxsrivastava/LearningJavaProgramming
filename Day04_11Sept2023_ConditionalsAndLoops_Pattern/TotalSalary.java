package while_loop;
import java.util.Scanner;
public class TotalSalary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int basic=scan.nextInt();
		int grade=scan.next().charAt(0);
		
		double hra = basic*0.2;
		double da = basic*0.5;
		double pf = basic*0.11;
		
		int allow;
		
		if(grade=='A'){
			allow = 1700;
		} 
		else if(grade=='B') {
			allow=1500;
		}
		else {
			allow=1300;
			}
		double totalSalary= (basic+hra+da+allow-pf);
		
//		int roundedoff=(int)totalSalary;
//	
//		double diff = totalSalary -roundedoff;
//		if (diff>=0.5) {
//	
//			System.out.println(roundedoff+1);
//		 }else {
//			 System.out.println(roundedoff);
//		 }
		int ans = (int)Math.round(totalSalary);
			System.out.println(ans);

	}
}
