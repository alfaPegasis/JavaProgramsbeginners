import java.util.*;
class salarycoders
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the name of the coder :");
        String name=sc.nextLine();
        int salary=0;
        switch(name)
        {
            case "Katia": salary=1000;
            case "CSJack": salary=4000;
            case "Tim": salary=3000;
            case "Qazi": salary=2000;
            default:
            System.out.println("No coder available for that name.");
            
        }
        System.out.println(salary);





    }
}