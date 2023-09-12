// import java.util.Scanner;
// public class HalfDiamondPattern {
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();

//         int FirstHalf=(n+1);
//         int SecondHalf=(n);

//         int i=1;
//         while(i<=FirstHalf)
//         {
//             System.out.print("*");
//             int j = 1;
//             while(j<=i-1)
//             {
//                 System.out.print(j);
//                 j++;
//             }
//             int k=1;
//             while(k<=i-2)
//             {
//                 System.out.print(i-k-1);
//                 k++;
//             }
//             if(i>=2)
//                 System.out.print("*");
//             i++;
//             System.out.println();

//         }
//         int l =1;
//         while(l<=SecondHalf)
//         {
//             if(l<=SecondHalf+1)
//                 System.out.print("*");
//             int m = 1;
//             while(m<=SecondHalf-l)
//             {
//                 System.out.print(m);
//                 m++;
//             }
//             int o =1;
//             while(o<=n-l-1)
//             {
//                 System.out.print(n-l-o);
//                 o++;
//             }
//             if(l<n)
//             System.out.print("*");
//             l++;
//             System.out.println();
//         }
//         if(SecondHalf==0)
//         {
//             System.out.print("*");
//         }

    
//     }
// }
import java.util.Scanner;
public class HalfDiamondPattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int FirstHalf=(n+1);
        int SecondHalf=(n);

        int i=1;
        while(i<=FirstHalf)
        {
            System.out.print("*");
            int j = 1;
            while(j<=i-1)
            {
                System.out.print(j);
                j++;
            }
            int k=1;
            while(k<=i-2)
            {
                System.out.print(i-k-1);
                k++;
            }
            if(i>=2)
                System.out.print("*");
            i++;
            System.out.println();

        }
        int l =1;
        while(l<=SecondHalf)
        {
            if(l<=SecondHalf+1)
                System.out.print("*");
            int m = 1;
            while(m<=SecondHalf-l)
            {
                System.out.print(m);
                m++;
            }
            int o =1;
            while(o<=n-l-1)
            {
                System.out.print(n-l-o);
                o++;
            }
            if(l<n)
            System.out.print("*");
            l++;
            System.out.println();
        }
        if(SecondHalf==0)
        {
            System.out.print("*");
        }

    
    }
}
