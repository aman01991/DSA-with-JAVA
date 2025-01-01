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


 int[] arr = {3, 6, 17, 26, 12};
System.out.println(arr.length);

 int greatest = 0;
 for(int i = 0; i < arr.length; i++){
 if(arr[i] > greatest){
 greatest = arr[i];
 }
 }
System.out.println(greatest);


 //inputArray(arr);
 //printArray(arr);
 //findMissingNum(arr);






}


}