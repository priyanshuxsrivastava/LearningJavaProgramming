
import java.util.Scanner;
public class DiamondOfStars 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        if(n%2!=0)
        {
            int a=1;
            int x = ((n+1)/2);
            int y = n-x;
            while(a<=x)
            {
                int j =1;
                while(j<=x-a)
                {
                    System.out.print(" ");
                    j++;

                }
                int k=1;
                while(k<=a)
                {
                    System.out.print("*");
                    k++;
                }
                int l =1;
                while(l<=a-1)
                {
                    System.out.print("*");
                    l++;
                }
                a++;
                System.out.println();
            }

            int b=1;
            while(b<=y)
            {
                int j=1;
                while(j<=b)
                {
                    System.out.print(" ");
                    j++;
                }
                int k =1;
                while(k<=y-b+1)
                {
                    System.out.print("*");
                    k++;
                }
                int l =1;
                while(l<=y-b)
                {
                    System.out.print("*");
                    l++;
                }
            b++;
            System.out.println();
            }
        }
        else
            {
            System.out.println("Enter only odd number");
            }

    }
}
