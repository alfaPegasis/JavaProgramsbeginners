import java.util.Scanner;

public class rs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int a = num;
        int digit;
        String b="";
        String c="";        
        digit=a%10;
        a=a/10;
        b=String.valueOf(a);
        c=String.valueOf(digit);
        c=c+b;
        System.out.println("Left shift : " + c);
    }
    
}
