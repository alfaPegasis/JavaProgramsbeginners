//find number of positive, negative and sum of positive numbers

import java.util.*;
class num{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the limit : ");
        int n=sc.nextInt();
        int positive=0,negative=0;
        double sum=0;
        for (int i =1;i<=n;i++)
        {
            System.out.println("Enter the number : ");
            double a=sc.nextDouble();

            if (a>=0)
            {
                positive=positive+1;
                sum=sum+a;
            }
            else if (a<0)
            {
                negative=negative+1;
            }            
        }
        System.out.println("Positive Numbers: "+ positive);
        System.out.println("Negative Numbers: " +  negative);
        System.out.println("Sum of positive numbers: " + sum);
    }
}