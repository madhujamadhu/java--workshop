import java.time.LocalDate;
import java.util.Scanner;

public class Agecalu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your date of bith(yy-mm-dd):");
        String dateofbrith=scan.nextLine();
        LocalDate birthDate=LocalDate.parse(dateofbrith);
        int yearofbrith=scan.nextInt();
        int currentyear=LocalDate.now().getYear();
        int age=currentyear-yearofbrith;
        System.out.println("your age:"+age); 
    }
    
}
