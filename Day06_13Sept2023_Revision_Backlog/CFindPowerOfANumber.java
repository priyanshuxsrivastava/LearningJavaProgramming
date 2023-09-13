package Day06_13Sept2023_Revision_Backlog;
import java.util.Scanner;
public class CFindPowerOfANumber {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();

        int i =1,y=1;
        while(i<=n)
        {
       
            y=y*x;
            i++;
        }
        // if(n!=0)
        // {
        System.out.println(y);
        // }
        // else
        // {
        //     System.out.println("1");
        // }
    }
}
