import java.util.Scanner;

class StarPattern{

public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
 System.out.print("Input format: n = ");
 int r = sc.nextInt();
 System.out.println("Results: ");
 
 /* char ch = 'a';
 int N = 1;
 for(int column = 1; column < n; column++){
 for(int row = 0; row < column; row++){ 
 if(column  ==  ){
 System.out.print(" " + ch++ + " ");
 }
 else{
 System.out.print(" " + N++ + " ");
 }
 }
 System.out.println();
 } */



 //*********Mirror of Traingle Pattern
 /* for(int column = 1; column <= n; column++){
 for(int row = 1; row <= n; row++){
 if(row <= n-column){
 System.out.print("  ");
 }
 else{
 System.out.print("* ");
 }
 }
 System.out.println("  ");
 } */


 //*********Cross Pattern
 /* for(int row = 1; row <= n; row++){
 for(int column = 1; column <= n; column++){
 if(row == column || column == n+1-row ){
 System.out.print("* ");
 }
 else{
 System.out.print("  ");
 }
 }
 System.out.println("  ");
 } */



 //*********Opposite of mirror of traingle Pattern
 for(int i = 0; i < r; i++){ 
 for (int j = 0; j < r; j++){
 if (j < r-i-1){
 System.out.print("*");
 } 
 else{
 System.out.print(" ");
 }
 }
 System.out.println(" "); 
 }






 





}
}