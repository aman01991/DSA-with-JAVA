class Swap2{

public static void main(String[] args){

int a = 4;
System.out.println("This is int type: " + a);

double b = 8;
System.out.println("This is double type: " + b);

double c;
c=b;
b=a;  // widening
a=(int)c;

//Narrowing double>long>float>int>short>byte

System.out.println((double)a);
System.out.println((int)b);


}
}