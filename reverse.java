import java.util.*;
class tt
{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int a = sc.nextInt();
    int num=a;
    int digit = 0;
    int reverse = 0;
    while(a!=0)
    {
        digit=a%10;
        reverse=reverse*10+digit;
        a=a/10;

    }
    System.out.println("Reversed number is : "+reverse);
    
}
}