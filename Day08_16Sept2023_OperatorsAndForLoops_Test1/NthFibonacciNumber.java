package Day08_OperatorsAndForLoops_Test1;
import java.util.Scanner;
public class NthFibonacciNumber {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int a=0,b=1,sum=a+b;
            for(int i=1;i<=n;i++)
            {
                a=b;
                b=sum;
                sum=a+b;
            }
            System.out.println(a);
        }
}
