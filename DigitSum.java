
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(true){
            while(n!=0)
            {
                int r=n%10;
                sum=sum+r;
                n=n/10;
               
            }
             if(sum/10==0)
            {
                break;
            }
               n=sum;
               sum=0;
        }
        
        System.out.println(sum);
    }
 
}
