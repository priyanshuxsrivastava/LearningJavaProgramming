package Day06_13Sept2023_Revision_Backlog;
import java.util.Scanner;
public class ASumOfEvenAndOdd {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i,j=n,even=0,odd=0;

        while(j>0)
        {
            i = j%10;
            if(i%2==0)
            {
                even=even+i;
            }
            else
            {
                odd=odd+i;
            }
            j=j/10;
        }
        // if(j%2==0)
        // {
        //     even=even+j;
        // }
        // else
        // {
        //     odd=odd+j;
        // }
        System.out.println(even+" "+odd);
    }
}
