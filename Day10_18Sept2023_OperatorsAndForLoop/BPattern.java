package Day10_OperatorsAndForLoop;
import java.util.Scanner;
public class BPattern {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=1;
        while(i<=n)
        {
            int j =1;
            while(j<=n)
            {
                System.out.print(j + " ");
                j++;
                if(j>i)
                {
                    break;
                }
            
            }
            System.out.println();
            i++;
        }
}
}

