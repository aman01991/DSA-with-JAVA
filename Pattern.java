class Pattern {

public static void main (String[] args){
 
 /* for(int a = 0; a < 5; a++){
 System.out.println("hellow " + a);
 } */


 
 /* for(int row = 0; row < 5; row++){
 for(int column = 0; column < 5; column++){
 System.out.print("* ");
 }
 System.out.println();
 } */
 


  int i = 0;
 while(i<5){
 for(int row = 0; row < 5; row++){
 if(i == 0 || i == 4 || row == 0 || row == 4){
 System.out.print("* ");
 }
 else{
 System.out.print("  ");
 }
 }
 System.out.println();
 i++;
 } 


 
 /* int i = 0;
 while(i<4){
 for(int row = 0; row < 4; row++){
 if(i == 0 || i == 3 || row == 0 || row == 3){
 System.out.print("* ");
 }
 else{
 System.out.print("+ ");
 }
 }
 System.out.println();
 i++;
 } */





}

}