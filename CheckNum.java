import java.util.Scanner;

class CheckNum{

public static void main(String[] args){

 /* int num = 19;
 boolean isPrime = true;
 if(num < 2){
 isPrime = false;
 }

 for(int i = 2; i*i <= num; i++){
 if(num % i == 0){
 isPrime = false;
 break;
 }
 }

 if(isPrime){
 System.out.println(num + " is a Prime number");
 }
 else{
 System.out.println(num + " is not a Prime number");
 } */

 
 //**********Find the GCD and LCM********** 
 /* Scanner sc = new Scanner(System.in);
 int n1 = sc.nextInt();
 int n2 = sc.nextInt();

 int on1 = n1;
 int on2 = n2;

 //****GCD****
 while(n1 % n2 != 0){
 int rem = n1 % n2;
 n1 = n2; 
 n2 = rem;
 }

 int gcd = n2;

 //****LCM****
 int lcm = (on1 * on2) / gcd;

 System.out.println(gcd);
 System.out.println(lcm); */


 //********Reverse a Number
 /* int num = 27649;

 int last = 0;
 int reversed = 0;
 while(num > 0){
 last = num % 10;
 num = num / 10;
 reversed = 10*reversed + last;
 }
System.out.println(reversed); */


 //********Odd and Even
 /* if(num % 2 == 0){
 System.out.println(num + " is Even");
 }
 else{
 System.out.println(num + " is Odd");
 } */




Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int count = 0;
        
        while(num > 0){
           int last = num % 10;
          
        
        boolean isPrime = true;
         for(int i = 2; i*i <= last; i++){
             if(num % i == 0){
             isPrime = false;
             break;
            }
         }
         
          if(isPrime){
            System.out.println(last + " is a Prime number");
            count++;
          }
         num = num /10; 
        }
    System.out.println(count); 











}

}