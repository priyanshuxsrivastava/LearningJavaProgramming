package Day05_12Sept2023_Patterns_OperatorsAndForLoop_Test1;
import java.util.Scanner;
public class InvertedNumberPattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int i =1 ;
        while(i<=n){
            int j =1;
            while(j<=n-i+1){
                System.out.print(n-i+1);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
