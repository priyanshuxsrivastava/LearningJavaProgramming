import java.util.Scanner;
public class CSumOrProduct {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        switch(c)
        {
            case 1:
                int sum = 0;
                for(int i =1;i<=n;i++)
                {
                    sum=sum+i;
                }
                System.out.println(sum);
                break;
            case 2:
                int prod=1;
                for(int i =1;i<=n;i++)
                {
                    prod =prod*i;
                }
                System.out.println(prod);
                break;
            default:
                System.out.println(-1);
        }   

    }
    
}
