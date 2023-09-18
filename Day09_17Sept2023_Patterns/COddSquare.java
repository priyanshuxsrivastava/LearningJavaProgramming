import java.util.Scanner;
public class COddSquare {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i =1 , icount=0;
        while(i<=n)
        {
            int j =1,jcount=icount;
            while(j<=n-i+1)
            {
                System.out.print(j+jcount);
                jcount=jcount+1;
                j++;
            }
            int k =1,kcount=0;
            while(k<=i-1)
            {
                System.out.print(k+kcount);
                kcount+=1;
                k++;

            }
            icount=icount+2;
            i++;
            System.out.println();
        }
    }
    
}
