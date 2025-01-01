import java.util.Scanner;

class InputGame{

public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
 
 System.out.println("****** Your Game Starts(to end enter 0) ******* ");
 int input;
 
 int sum = 0;
 boolean b = true;
 
 while(b){
 System.out.print("Enter a Number: ");
 input = sc.nextInt();

 if(input > 0){
 sum += input;  
 System.out.print("Your sum is: " + sum );
 System.out.println();
 }
 else{
 b = false;
 System.out.println("Game Over!!!");
 System.out.println("Your Score is: " + sum);
 }
 } 

}

}