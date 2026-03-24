import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Student's Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Number of Units Registered: ");
        int units = scanner.nextInt();
        
        String status;
        if (units > 7) {
            status = "overload - Approval Required";
        } else {
            status = "Registration Accepted";
        }
        
        System.out.println("Student Name: " + name);
        System.out.println("Units Registered: " + units);
        System.out.println("Registration Status: " + status);
        
        scanner.close();
    }
}