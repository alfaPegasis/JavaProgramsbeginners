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
                break;
            case "CSJack": salary=4000;
                break;
            case "Tim": salary=3000;
                break;
            case "Qazi": salary=2000;
                break;
            default:
            System.out.println("No coder available for that name.");
            
        }
        System.out.println(salary);





    }
}
