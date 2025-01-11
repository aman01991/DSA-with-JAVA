import java.util.Scanner;

class Datatype{

static double add(float a, double b){
 return a+b;
}

static float add(int a, float b){
 return a+b;
}

static int add(short a, int b){
 return a+b;
}

static void add(float a, double b){
 System.out.println(a+b);
} 

public static void main (String[] args){
 Scanner sc = new Scanner(System.in);
 //Datatype dt = new Datatype();
 System.out.println("Enter a Value : ");
 
 int i = sc.nextInt();
 int j = sc.nextInt();

 //case 1
 //int sum = add(i,j);
 //System.out.println(sum);

 //case 2
 System.out.println("The sum is: "+ add(i,j));

 //case 2
 //add(i,j);





  //char ch = sc.next().charAt(0);
  
 
}
}