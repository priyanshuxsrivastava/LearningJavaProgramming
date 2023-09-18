package ABreakDemo;
import java.util.Scanner;
public class ABreakDemo{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        boolean divided=false;
        for(int d =2;d<n;d++)
        {
            if(n%d==0)
            {
                divided=true;
                break;
            }
            d++;

        }
        if(divided)
        {
            System.out.println("not a prime");
        }
        else
        {
            System.out.println("prime");
        }

    }
}