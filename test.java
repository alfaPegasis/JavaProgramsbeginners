import java.util.*;
class test 

{
    public static void main(String args[])
    {
        int greatest =0;int l1=0;int l2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the traingle : ");
        System.out.println("First Side : ");
        int a=sc.nextInt();
        System.out.println("Second Side : ");
        int b=sc.nextInt();
        System.out.println("Third Side : ");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            greatest=a;
            l1=b;
            l2=c;

        }
        else if (b>a && b>c)
        {
            greatest=b;
            l1=a;
            l2=c;
        }
        else 
        {
            greatest=c;
            l1=b;
            l2=a;
        }
        boolean theorem=false;
        if ((greatest*greatest)==((l1*l1) + (l2*l2)))
        {
            
            theorem=true;
        }
        else 
        {
            theorem=false;
        }
        if (theorem==true)
        {
            System.out.println("It is a Pythagorean triplet ! ");
        }
        else 
        {
            System.out.println("It is not a Pythagorean triplet ! ");
        }
    }
}