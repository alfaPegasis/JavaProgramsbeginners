import java.util.*;
class niven
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int a=num;
        int digit=0;
        int sum=0;
        //digit nikal liya pehle
        while(a!=0)
        {
            digit=a%10;
            //digit ko sum mei jod diya
            sum=sum+digit;
            a=a/10;
        }
        //niven nikala
        int niven=(int) num/sum;
        //print kardiya
        System.out.println("The niven number of the given number is :"+ niven);
    }
}