package Day05_12Sept2023_Patterns_OperatorsAndForLoop_Test1;
import java.util.Scanner;
public class IsoscelesTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i =1;
        while(i<=n){
            int j =1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=i){
                System.out.print(k);
                k++;
            }
            int l =1;
            while(l<=i-1){
                System.out.print(i-l);
            l++;
            }
            System.out.println();
            i++;
        }
    }
}
