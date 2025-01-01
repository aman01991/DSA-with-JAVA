import java.util.Scanner;

class Switch{

public static void main(String[] args){

 Scanner sc = new Scanner(System.in);

 System.out.print("Enter Day: ");
 int s = sc.nextInt();

 //**********if, else Conditional Statement
 if(s == 1 || s == 2){
  System.out.println("Work From Office");
 }
 else if(s == 3 || s == 4){
 System.out.println("Work From Home"); 
 }
 else if(s == 5){
 System.out.println("Market Work"); 
 }
 else if(s == 6 || s == 7){
 System.out.println("Holiday"); 
 }
 else{
 System.out.println("Invalid Input btn 1 and 7"); 
 } 

  

 //***********Switch Case(Conditional Statement) & break and Continue(Control Statement)
 /* switch(s){
 case "Monday":  
 case "Tuesday":  System.out.println("Work From Office"); break;
 case "Wednesday":  
 case "Thrusday":  System.out.println("Work From Home"); break;
 case "Friday":  System.out.println("Market Work"); break;
 case "Saturday":  
 case "Sunday":  System.out.println("Holiday"); break;
 default : System.out.println("Invalid Input"); 
 } */
 
 

}
}