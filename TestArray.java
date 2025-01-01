class TestArray{

static void printArray(int arr[]){
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


 /* int[] arr = {2,4,3,7,8,5};
 System.out.println("Length of your Array: " + arr.length);

 int[] odd = new int[arr.length];
 int[] even = new int[arr.length];
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
 } */

 //******1st Method to print even and odd array******
 /* System.out.print("Even Array: ");
 for(int i = 0; i < indexEven; i++){
 if(i < indexEven-1){
 System.out.print(even[i] + ", ");
 }
 else{
 System.out.print(even[i]);
 }
 }

 System.out.println();

 System.out.print("Odd Array: ");
 for(int i = 0; i < indexOdd; i++){
 if(i < indexOdd-1){
 System.out.print(odd[i] + ", ");
 }
 else{
 System.out.print(odd[i]);
 }
 } */


 //******2nd Method to print even and odd array******
 //printArray(even);
 //printArray(odd);



 //Find the greatest number in the given array
 /* int[] arr = {2,3,6,5,1,32,44,12};
 int greatest = 0;
 for(int i = 0; i < arr.length; i++){
 if(arr[i] > greatest){
 greatest = arr[i];
 }
 }
System.out.println(greatest + " :is the greatest number"); */





 /*even[0] = arr[i];
 even[1] = arr[i];
 even[2] = arr[i];

 odd[0] = arr[i];
 odd[1] = arr[i];
 odd[2] = arr[i]; */


}


}