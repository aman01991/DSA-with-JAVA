import java.util.Scanner;

class EvenOdd{

public static void main(String[] args){

 Scanner sc = new Scanner(System.in);

 System.out.print("Enter a Value: ");
 int input = sc.nextInt();

 
 if(input % 2 == 0){
 System.out.println(input + " :This number is even ");
 }
 else{
 System.out.println(input + " :This number is odd");
 }

}
} 