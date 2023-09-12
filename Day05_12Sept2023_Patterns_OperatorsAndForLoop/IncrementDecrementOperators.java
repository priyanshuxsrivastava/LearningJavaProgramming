 public class IncrementDecrementOperators {
    public static void main(String[] args)
    {
         int i =10;
         int j=i++,c=i++;
         System.out.println(j+" "+c);

        int  a =10;
        System.out.println(a++);
        a++;
        ++a;
        System.out.println(a);

        int b =++a;
        System.out.println(b);
        System.out.println(a);
        
        a=4;
        a*=2;
        System.out.println(a);

        a^=2;
        System.out.println(a);
    }
    
}
