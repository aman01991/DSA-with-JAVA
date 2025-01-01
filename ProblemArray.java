import java.util.Scanner;
import java.util.ArrayList;

class ProblemArray{

static void printArray(int arr[]){
 System.out.println("Length of an Array: " + arr.length);
 System.out.print("Elements of an Array: ");
 for(int i = 0; i < arr.length; i++){
 if(i < arr.length - 1){
  System.out.print(arr[i] + ", ");
 }
 else{
  System.out.println(arr[i]);
 }
 }
}


static void reverseArray(int arr[]){
 System.out.print("Reverse the element of an Array: ");
 int[] reverse = new int[arr.length];
 for(int i = 0; i < reverse.length; i++){
 reverse[i] = arr[arr.length-1-i];
 if(i < reverse.length - 1){
  System.out.print(reverse[i] + ", ");
 }
 else{
  System.out.println(reverse[i]);
 }
 }
}


public static void main(String[] args){

 //int[] arr = {2,3,5,6,12};
 Scanner sc = new Scanner(System.in);


 System.out.print("Enter Number: ");
 int n = sc.nextInt();

 int n1 = n;
 int count = 0;
 while(n1 > 0){
 n1 /= 10;
 count++;
 }
 

 /* int[] arr = new int[count];
 for(int i = 0; i < arr.length; i++){
 arr[arr.length-1-i] = n % 10;
 n /= 10;
 } */
 

 //printArray(arr);

 ArrayList<Interger> arr = new ArrayList<>();
 for(int i = 0; i < arr.length; i++){
 arr[arr.length-1-i] = n % 10;
 n /= 10;
 }

 printArray(arr);



 








}


}