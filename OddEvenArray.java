import java.util.Scanner;

class OddEvenArray{

static void printArray(int arr[]){
 System.out.print("Elements of an Array: ");
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

public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
 System.out.print("Enter Numbers: ");
 int n = sc.nextInt();

 int n1 = n;
 int count = 0;
 while(n1 > 0){
 n1 /= 10;
 count++;
 }

 System.out.println("Digits Count: " + count);

 int[] arr = new int[count];
 for(int i = 0; i < count; i++){
 arr[i] = n % 10;
 n /= 10;
 }

 printArray(arr);
 

 int[] odd = new int[count];
 int[] even = new int[count];
 int indexOdd = 0;
 int indexEven = 0;

 for(int i = 0; i < arr.length; i++){
 if(arr[i] % 2 == 0){
 even[indexEven] = arr[i];
 indexEven++;
 }
 else{
 odd[indexOdd] = arr[i];
 indexOdd++;
 }
 }

 printArray(even);
 printArray(odd);




 








}


}