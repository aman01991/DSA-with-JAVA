class Swap{

public static void main(String[] args){

int a = 5;
int b = 8;
System.out.println("The value of a is " + a);
System.out.println("The value of b is " + b);

/* int c;
c = a;
a = b;
b = c; */

a = a + b;
b = a - b; 
a = a - b;
System.out.println("After swap value of a is " + a);
System.out.println("After swap value of b is " + b);


}
}