import java.util.Scanner;

class InputGame2{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("****** Your Game Starts(To end enter 0) ******* ");
int input;

int multiple = 1;

do{
 System.out.print("Enter a Number: ");
 input = sc.nextInt();
 
 if(input > 0){
 multiple *= input;  
 System.out.print("Your multiple is: " + multiple);
 System.out.println();
 }
 else{
 System.out.println("Game Over!!!");
 System.out.println("Your Score is: " + multiple);
 }
}while(input>0);

}
}