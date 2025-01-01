class SquarePattern {

public static void main(String[] args){

 int n = 1;

 int i = 0;
 while(i < 6){
 for(int row = 0; row < 6; row++){
 if(i == 0 || row == 0 || i == 5 || row == 5){
 System.out.print(" * ");
 }
 else if(i == 1 || row == 1 || i == 4 || row == 4){
 System.out.print(" + ");
 }
 else{
 System.out.print(" "+ n++ + " ");
 }
 }
 System.out.println();
 i++;
 }


}
}