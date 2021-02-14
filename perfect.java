import java.util.*;
class perfect
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int sum=0;
        int a=n;
        for(int i =1;i<n;i++)
        {
            if (a%i==0)
            {
                sum=sum+i;
            }

        }
        System.out.println("Sum :" +sum);
        if (sum==n)
        {   
            ;
            System.out.println("It is a Perfect number");
        }
        else
        {
            System.out.println("It is  not a Perfect number");
        }
    }
}