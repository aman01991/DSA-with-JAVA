 import java.util.Scanner;

class GreatestOfThree{

public static void main(String[] args){

 Scanner sc = new Scanner(System.in);

 System.out.print("a = ");
 int a = sc.nextInt();

 System.out.print("b = ");
 int b = sc.nextInt();

 System.out.print("c = ");
 int c = sc.nextInt();

 System.out.print("d = ");
 int d = sc.nextInt();

 int Greatest = a;
 
 if(b>Greatest){
 Greatest = b;
 }
 if(c>Greatest){
 Greatest = c;
 }
 if(d>Greatest){
 Greatest = d;
 }

 System.out.println("The Greatest number is: " + Greatest);
 

}
}