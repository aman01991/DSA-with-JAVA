import java.util.Scanner;

class ArraySum{

static Scanner sc = new Scanner(System.in);

static void inputArray(int arr[]){
 System.out.print("Enter Element: ");
 for(int i = 0; i < arr.length; i++){
  arr[i] = sc.nextInt();
 }
}


static void printArray(int[] arr){
 for(int i = 0; i < arr.length; i++){
  System.out.print(arr[i] + " ");
 }
System.out.println();
}


static void findMissingNum(int[] arr){
 for(int i = 0; i < arr.length; i++){
  if(arr[i] != i+1){
   System.out.print("Missing Number is: " + (i+1));
   break;
  }
 }
}

public static void main(String[] args){

 /* System.out.print("Size of an Array: ");
 int size = sc.nextInt();
 int[] arr = new int[size]; */


 //inputArray(arr);
 //printArray(arr);
 //findMissingNum(arr);



 //*****Find Greatest Number in the Array Elements
 /* int[] arr = {3, 6, 17, 26, 12};
 System.out.println(arr.length);

 int greatest = 0;
 for(int i = 0; i < arr.length; i++){
 if(arr[i] > greatest){
 greatest = arr[i];
 }
 }
System.out.println(greatest); */



 //********Print the Fabonacci Sequence********
 /* System.out.print("Enter the Number: ");
 int num = sc.nextInt();
 int first = 0;
 int second = 1;
 System.out.print("Fabonacci Sequence: " + first + " " + second + " ");

 for(int i = 3; i <= num; i++){
 int sum = first + second;
 first = second;
 second = sum;
 System.out.print(sum + " ");
 }
System.out.println(); */


 //************Find the GCD************
 /* int n1 = sc.nextInt();
 int n2 = sc.nextInt();

 while(n1 % n2 != 0){
 int rem = n1 % n2;
 n1 = n2;
 n2 = rem;
 }

 int gcd = n2;
System.out.println(gcd); */

 

















}


}