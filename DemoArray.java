import java.util.Scanner;

class DemoArray{

static void printArray(int arr[]){
 System.out.println("Length of an Array: " + arr.length );
 System.out.print("Elements of the Array: ");

 for(int i = 0; i < arr.length; i++){
 if(i < arr.length-1){
 System.out.print(arr[i] + ", ");
 }
 else{
 System.out.print(arr[i]);
 }
 }
System.out.println();
}


static void reverseArray(int arr[]){
 System.out.print("Elements of the Reverse Array: ");
 int[] reverse = new int[arr.length]; 
 for(int i = 0; i < reverse.length; i++){
 reverse[i] = arr[arr.length-1 -i];
 if(i < reverse.length-1){
  System.out.print(reverse[i] + ", ");
 } 
 else{
  System.out.print(reverse[i]);
 }
 }
System.out.println();
}




public static void main(String[] args){

 Scanner sc = new Scanner(System.in);

 /* int array2[];
 System.out.print(array2);
 error: variable array2 might not have been initialized */

 /* int a[] = {3};
 System.out.println(a); //Print the address of Array of a
 System.out.println(a[0]); //Print the Element of Array present at the first position
 */
 

 /* int a[] = {3};
 //error: outOfbound
 int a[1] = sc.nextInt(); */


 /* int arr[] = {3,4,5,7,8};
 System.out.print(arr.length);
 printArray(arr); */


 /* int[] arr2 = new int[5];
 System.out.println(arr2.length); */


 //System.out.print("Enter the size of Array: ");
 //int size = sc.nextInt(); 


 /* int[] arr3 = new int[size];
 for(int i = 0; i < arr3.length; i++){
 arr3[i] = sc.nextInt();
 }

 printArray(arr3);  */


 //int[] arr4 = arr3;
 //printArray(arr4); 



 //*************Reverse the Array*************
 //int[] reverseArr = new int[arr3.length]; 

 /* reverseArr[0] = arr3[arr3.lenght-1 -0];
 reverseArr[1] = arr3[arr3.length-1 -1];
 reverseArr[2] = arr3[arr3.length-1 -2];
 reverseArr[3] = arr3[arr3.length-1 -3];
 reverseArr[reverseArr.length-1] = arr3[0]; */

 /* for(int i = 0; i < reverseArr.length; i++){
 reverseArr[i] = arr3[arr3.length-1 -i];
 }

 printArray(reverseArr); */


 //****Take a User Input ArraySize and Number to store each digit in an array
 /* System.out.print("Enter the size of Array: ");
 int size = sc.nextInt();

 int[] arr5 = new int[size];

 System.out.print("Enter Numbers: ");
 int num = sc.nextInt();

 for(int i = 0; i < size; i++){
 arr5[i] = num % 10;
 num /= 10;
 }

 int[] reverseArr = new int[arr5.length]; 
 for(int i = 0; i < reverseArr.length; i++){
 reverseArr[i] = arr5[arr5.length-1 -i];
 } 

 printArray(arr5);
 System.out.println("-------------------------");
 printArray(reverseArr); */


 //****Take a User Input Number to store each digit in an array****
 System.out.print("Enter Numbers: ");
 int n = sc.nextInt();

 int n1 = n;
 int count = 0;
 while(n1 > 0){
 n1 /= 10;
 count++;
 }

 int[] arr6 = new int[count];

 for(int i = 0; i < count; i++){
 arr6[i] = n % 10;
 n /= 10;
 }

 printArray(arr6); 
 reverseArray(arr6);
 


 






 
 
 






}


}