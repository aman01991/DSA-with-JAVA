class Calculator{

void display(int n){
 for(int i = 1; i <= n; i++){
 int start;
 if (i % 2 == 0) {
  start = 0;
 } 
 else {
  start = 1;
 }
 for(int j = 1; j <= i; j++){
 System.out.print(start);
 if (start == 1) {
  start = 0;
 }
 else {
  start = 1;
 }
 }
System.out.println(" ");
 }
}

public static void main(String[] args){


 Calculator cnum = new Calculator();
 cnum.display(6);






}
}