import java.util.Scanner;
public class DTermsOfAP {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1,count=0;i<=n+count;i++)
        {
            int j =3*i+2;
            if(j%4==0)
            {   
                count++;
                continue;
            }
            System.out.print(j+" ");
        }
        
    }
    
}
