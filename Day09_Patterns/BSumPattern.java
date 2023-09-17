import java.util.Scanner;
public class BSumPattern {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i =1;
        while(i<=n)
        {
            int j = 1,count =0;
            while(j<=i)
            {
                if(j==1)
                {
                System.out.print(1);
                }
                if(j>=2)
                {
                    System.out.print("+"+j);
                }
                count = count +j;
                j++;

            }
            
            System.out.print("="+count);
            System.out.println();

            i++;
        }
    }
}
