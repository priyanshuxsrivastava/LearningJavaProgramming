package Day07_15Sept2023_OperatorsAndForLoop;
import java.util.Scanner;
public class ASumTillN {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // int i =1;
        // int sum = 0;
        // while(i<=n)
        // {
        //     sum= sum +i;
        //     i = i+1;
        // }
        // System.out.println(sum);

        int sum=0;
        for(int i=1,j=1;i<=n ;i=i+1,j=j+1)
        {
            sum=sum+i;

        }
        System.out.println(sum);
        
		
		
    }
    
}
