package Day10_OperatorsAndForLoop;
import java.util.Scanner;
public class DAllPrimeNumbers {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =2;i<=n;i++)
        {
            for (int j = 2;j<=i;j++)
            {
                if(i%j!=0)
                {
                    continue;               
                }
                if(j!=i)
                {
                    break;
                }
                System.out.println(i);
            }
        }
    }
}
