import java.util.Scanner;

public class Namegenerator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter yoer name:");
        String name=scanner.next();
        System.out.println("enter your gender:");
        String gender=scanner.next();
        if("male".equalsIgnoreCase(gender)){
            System.out.println("mr"+name);
        }else{ 
            System.out.println("ms"+name); 
        }
        System.out.println("enter your qualification:");
        String qualification=scanner.next();
        System.out.println(name+" ."+qualification);
    }
    
    
}
