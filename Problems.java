import java.util.Scanner;

class Problems{

//****************Non-Static Methods****************

void reverseNum(int num){
 int last= 0;
 int reverse = 0;
 while(num>0){
 last = num%10;
 num = num/10;
 reverse = 10*reverse + last;
 }
System.out.println("Reversed Number: " + reverse);
}


void digitCount(int n){
 int count = 0;
 if(n < 0){
 n -= n;
 }

 if(n == 0){
 count = 1;
 }
 else{
 while(n > 0){
 n /= 10;
 count++;
 }
 }
System.out.print("The count of number is: " + count);
}


void swapNum(int a , int b){
 a = a + b; 
 b = a - b;  
 a = a - b;
 
 /* int c;
 c = a;
 a = b;
 b = c; */
System.out.println("The swap number (num, num2) are: (" + a + ", " + b + ")");
}


void sumDigit(int n){ 
 int m = 0;
 int sum = 0;
 while(n>0){
 m = n%10;
 n = n/10;
 sum = sum + m;
 }
System.out.println("Sum of digits: " + sum);
}


void productDigit(int n){ 
 int m = 0;
 int product = 1;
 while(n>0){
 m = n%10;
 n = n/10;
 product = product * m;
 }
System.out.println("Product of digits: " + product);
}


void palindrome(int num){
 int originalNumber = num;
 int last= 0;
 int reverse = 0;
 while(num>0){
 last = num%10;
 num = num/10;
 reverse = 10*reverse + last;
 }
System.out.println("Reversed Number: " + reverse);
 if(reverse == originalNumber){
 System.out.println("Yes, it is a Palindrome number");
 }
 else{
 System.out.println("No, it is not a Palindrome number");
 }
}


void trainglePattern(int n){
 int a = 1;
 char ch = 'a';
 for(int i = 1; i < n; i++){ 
 for (int j = 1; j < n; j++){
 if(j < i){
 System.out.print("  ");
 } 
 else if(i == 1){
 System.out.print(" " + a++);
 }
 else if(i == 2 || i == 4){
 System.out.print(" " + ch++);
 }
 else if(i == 3){
 System.out.print(" *");
 }
 else{
 System.out.print(" *");
 } 
 }
System.out.println("  "); 
 }
}


void greatestDigit(int n){
 int last = 0;
 int greatest = 0;
 while(n > 0){
 last = n%10;
 n = n/10;
 if(last > greatest){
 greatest = last;
 }
 }
System.out.println("The greatest digit is: " + greatest);
}


void countZero(int n){
 int last = 0;
 int count = 0;
 while(n > 0){
 last = n%10;
 n = n/10;
 int zero = last;
 if(zero == 0){
 count++;
 }
 }
System.out.println("The count of zero digit are: " + count);
}


void sumProduct(int n){
 int last = 0;
 int even = 0;
 int odd = 1;
 while(n > 0){
 last = n%10;
 n = n/10;
 if(last % 2 == 0){
 even += last;
 }
 else{
 odd *= last;
 }
 }
System.out.println("Sum of Even digits: " + even);
System.out.println("Product of Odd digits: " + odd);
}


void duckNumber(int n){
 boolean duckNum = false;
 while(n > 0){
 if(n%10 == 0){
 duckNum = true;
 }
 n = n/10;
 } 
System.out.println("This number contain zero. => " + duckNum);
if(duckNum == true){
System.out.println("So, it is a Duck Number");
}
else{
System.out.println("So, it is not a Duck Number");
}
}




public static void main(String[] args){

//****************User Input****************
 
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter num: ");
 int N = sc.nextInt();

//****************Objects Creation****************

 Problems pnum = new Problems();
 pnum.reverseNum(N); 

 //pnum.digitCount(N);

 /* System.out.print("Enter Num2: ");
 int b = sc.nextInt();
 pnum.swapNum(N, b); */

 //pnum.sumDigit(N);

 //pnum.productDigit(N);

 //pnum.palindrome(N);

 //pnum.trainglePattern(N);

 //pnum.greatestDigit(N);

 //pnum.countZero(N);

 //pnum.sumProduct(N);

 //pnum.duckNumber(N);



















}
}