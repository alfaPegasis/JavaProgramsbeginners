import java.util.*;
public class fibonacci
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=1;
        System.out.println("Fibonacci series is as folows : ");
        System.out.println(a);
        System.out.println(b);
        System.err.println(c);
        for(int i=3;i<=n;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.println(c);
        }

    }
    
}
