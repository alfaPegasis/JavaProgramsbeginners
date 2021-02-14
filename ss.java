//sum of first 50 positive odd integers
class ss 
{
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        int count=0;
        do 
        {
            sum=sum+i;
            //System.out.println(i);
            i=i+2;
            count++;
        }while(i<=100);
        System.out.println("sum of 50 positive even integers is :" + sum);
        System.out.println(count);
    }
}