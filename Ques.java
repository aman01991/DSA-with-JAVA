import java.util.Scanner;

class Ques{

public static void main(String[] args){

 //*********Perform ADD, SUB, MUL, DIV
 /* int a = 12;
 int b = 6;
 int Addition, Substraction, Multiplication, Division;
  System.out.println("Addition: " + (a+b));
 System.out.println("Substraction: " + (a-b));
 System.out.println("Multiplication: " + (a*b));
 System.out.println("Division: " + (a/b));
 System.out.println("Modulus: " + (a%b)); */


 //*********Cast values
 /* int a = 4;
 System.out.println("This is int type: " + a);
 System.out.println("This is double type: " + (double) a); 

 double b = 8;
 System.out.println("This is double type: " + b);
 System.out.println("This is int type: " + (int) b); */
 
 

 //*********AND / OR
 /* boolean x = true;
 boolean y = false;
 boolean AND = x && y;
 boolean OR = x || y;
 boolean NOT1 = !x;
 boolean NOT2 = !y;
 System.out.println(AND);
 System.out.println(OR);
 System.out.println(NOT1);
 System.out.println(NOT2); */


 //*********Assignment Operators
 /* int a, b;
 a = 10;
 System.out.println(a);
 System.out.println(a+=5);
 System.out.println(a-=5);
 System.out.println(a*=5);
 System.out.println(a/=5);
 System.out.println(a%=5); */


 //*********Comparison Operators
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Value1: ");
 int input1 = sc.nextInt();
 System.out.print("Enter a Value2: ");
 int input2 = sc.nextInt();
 System.out.println(input1>input2);
 System.out.println(input1<input2);
 System.out.println(input1==input2);
 System.out.println(input1!=input2);
 System.out.println(input1>=input2);
 System.out.println(input1<=input2); */


 //*********Check OddEven
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Value: ");
 int input = sc.nextInt();
 if(input %  2 == 0){
 System.out.println(input + " :This number is even ");
 }
 else{
 System.out.println(input + " :This number is odd");
 } */


 //*********Number divisible by 5
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Number: ");
 int input = sc.nextInt();
 int lastDigit = input % 5;
 if(lastDigit == 0){
 System.out.println(input + " is divisible by 5");
 }
 else{
 System.out.println(input + " is not divisible by 5");
 } */


 //*********Number divisible by 3
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Number: ");
 int input = sc.nextInt();
 int lastDigit = input % 3;
 if(lastDigit == 0){
 System.out.println(input + " is divisible by 3");
 }
 else{
 System.out.println(input + " is not divisible by 3");
 } */
 

 /* Uses of division and Modulus 
  where division will check Quotient and Modulus will check Remainder 
  Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Number1: ");
 int input1 = sc.nextInt();
 System.out.print("Enter a Number2: ");
 int input2 = sc.nextInt();
 System.out.println(input1/input2);
 System.out.println(input1%input2); */
 
/* int a = 5;
System.out.println(++a);
System.out.println(a++);
System.out.println(a);

int b = 6;
int c = 8;

System.out.println(a +" " + b + " " + c);
c = ++a + --b + a++ + a++ + b++;
System.out.println(a +" " + b + " " + c); */

 int x = -17;
 int y = x-- + --x + x-- + --x;
 int z = x++ - y++ + ++x - ++y + x-- - y-- + --x - --y;
 System.out.println(x +" " + y + " " + z);









}
}