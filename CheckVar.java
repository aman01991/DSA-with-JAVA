import java.util.Scanner;

public class CheckVar {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter a Value: ");
 char input = sc.next().charAt(0);

 if ((int)input>=0 && (int)input<=9) {
 System.out.println((int)input + "  The input is a number.");
 } 
 else if ((input>='a' && input <='z')||(input>='A' && input <='Z')) {
 System.out.println(input + "  The input is a character.");
 } 
 else {
 System.out.println(input + "  The input is a symbol.");
 }

        
 }
}
