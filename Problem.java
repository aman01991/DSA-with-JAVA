import java.util.Scanner;


class Problem{


//********Methods ********

static void adultCheck(int age){
 if(age>=18){
 System.out.println("You can watch porn!!!");
 }
 else{
 System.out.println("You can't watch porn");
 } 
}


static void oddEven(int n){
 if(n % 2 == 0){
 System.out.println(n + " :This number is even ");
 }
 else{
 System.out.println(n + " :This number is odd");
 }
}


static void pythagoras(int p, int b, int h){
 if(p*p + b*b == h*h){
 System.out.print("The sides forms a right-angled triangle!!!");
 }
 else{
 System.out.print("The sides do not forms a right-angled triangle");
 }
}


static void checkPower(int num, int power){
 int results = 1;
 for(int i = 1; i<=power; i++){
  results *= num;
 }
  System.out.println("The " + num + " to the power of " + power + " is: " + results);
}


static void sumNum(int n){
 int sum = n*(n+1)/2;
 System.out.println(sum);
}


static void calFactorial(int n){
 int factorial = 1;
 for(int i = 1; i<=n; i++){
 factorial *= i;
 }
 System.out.println(factorial);
}


static void primeNum(int n){
 if(n<=1){
 System.out.println(n + " is not satisfy the rule of prime number.");
 }

 boolean isPrime = true;
 for(int i = 2; i <= n; i++){
 if(n % i == 0){
 isPrime = false;
 break;
 }
 }

 if(isPrime){
 System.out.println(n + " is a prime number!!!");
 }
 else{
 System.out.println(n + " is not satisfy the rule of prime number.");
 }
}
 


static void fibonacci(int n){
 int num1 = 0;
 int num2 = 1;
 System.out.print(num1 + " " + num2);
 for(int i = 2; i <= n; i++){
 int result = num1 + num2;
 System.out.print(" " + result);
 num1 = num2; 
 num2 = result;
 }
}


static void printEven(int n){
 for(int i = 1; i <= n; i++){
 if(i % 2 == 0){
 System.out.print(" " + i);
 }
 }
}


static void countNumber(long n){
 long count = 0;
 if(n < 0){
 n -= n;
 }

 if(n == 0){
 count = 1;
 }
 else{
 while(n != 0){
 n /= 10;
 count++;
 }
 }
System.out.print("The count of number is: " + count);
}


public static void main(String[] args){


 //********Check age ristriction
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter Age: ");
 int num = sc.nextInt();

 adultCheck(num); */
		
   
  
 //********Check number is odd or even
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter Value: ");
 int N = sc.nextInt();

 oddEven(N); */



 //********Calculate Pyathagoras theorem
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter side a: ");
 int a = sc.nextInt();
 System.out.print("Enter side b: ");
 int b = sc.nextInt();
 System.out.print("Enter side c (hypotenuse): ");
 int c = sc.nextInt();
 
 pythagoras(a, b, c); */



 //********Calculate exponent number
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Number: ");
 int a = sc.nextInt();
 System.out.print("Power of the Number: ");
 int b = sc.nextInt();
 
 checkPower(a,b); */



 //********Calculate sum of n numbers
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Number: ");
 int N = sc.nextInt();
 System.out.print("The sum of N natural numbers is: ");
 
 sumNum(N); */



 //********Calculate factorial of N natural number
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Number: ");
 int N = sc.nextInt();
 System.out.print("The factorial of N natural numbers is: ");

 calFactorial(N); */



 //********Find the prime numbers of the N number
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Number: ");
 int N = sc.nextInt();

 primeNum(N); */

  
 
 //********Fibonacci Series
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Number: ");
 int N = sc.nextInt();

 fibonacci(N); */

 

 //********Print even numbers of the N number
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Number: ");
 int N = sc.nextInt();
 System.out.print("All of these numbers are even number:");

 printEven(N); */
 


 //********Count Number of digits
 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter the Number: ");
 long N = sc.nextLong();

 countNumber(N); */
 


  int num = 62357;
 int last = 0; 
 int reverse = 0;

 System.out.println(num + " " + last);
 System.out.println("-----------------------------");

 last = num % 10;
 num = num/10;
 System.out.println(num + " " + last);
 reverse = last; /*7*/
 System.out.println("Reversed Number: " + reverse);
 System.out.println("-----------------------------");

 last = num%10;
 num = num/10;
 //System.out.println(num + " " + last);
 reverse = 10*reverse + last; /*70*/
 int sum = reverse + last;
 System.out.println("Reversed Number: " + sum); /*75*/
 System.out.println("-----------------------------");

 last = num%10;
 num = num/10;
 System.out.println(num + " " + last);
 reverse = 10*sum; /*750*/
 sum = reverse + last;
 System.out.println("Reversed Number: " + sum);
 System.out.println("-----------------------------");

 last = num%10;
 num = num/10;
 System.out.println(num + " " + last);
 reverse = 10*sum; /*7530*/
 sum = reverse + last;
 System.out.println("Reversed Number: " + sum);
 System.out.println("-----------------------------");

 last = num%10;
 num = num/10;
 System.out.println(num + " " + last);
 reverse = 10*sum; /*75320*/
 sum = reverse + last;
 System.out.println("Reversed Number: " + sum); 




 











}

}