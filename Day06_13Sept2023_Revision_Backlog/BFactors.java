package Day06_13Sept2023_Revision_Backlog;
import java.util.Scanner;
public class BFactors {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i =2,count=0;
        while(i<n)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                
                count++;
            }
            i++;
        }
        if(count==0)
        {
            System.out.println("-1");
        }
    }
    
}
