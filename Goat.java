import java.util.Scanner;

class Goat{

public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
 /* System.out.print("Age pls = ");
 int age = sc.nextInt();

 String s = age>=18?"u can vote" : "u cant vote";
 System.out.println(s); */



 System.out.print("a = ");
 int a = sc.nextInt();
 System.out.print("b = ");
 int b = sc.nextInt();
 System.out.print("c = ");
 int c = sc.nextInt();
 System.out.print("d = ");
 int d = sc.nextInt();

 /* int g = a>b? (a>c? a : c) : (b>c? b : c);
 System.out.println(g); */

 int g = a>b? (a>c? (a>d? a : d): (c>d? c : d)) : (b>c? (b>d? b : d): (c>d? c : d));
 System.out.println(g);

}
}