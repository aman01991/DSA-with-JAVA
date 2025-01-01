import java.util.Scanner;

class Shape{

void square(int side){
 System.out.println("Area of Square: " + (side * side));
 System.out.println("Perimeter of Square: " + (4 * side));
}

void square(double side){
 System.out.println("Area of Square: " + (side * side));
 System.out.println("Perimeter of Square: " + (4 * side));
}



void rectangle(int length, int width){
 System.out.println("Area of the Rectangle: " + (length * width));
 System.out.println("Perimeter of the Rectangle: " + (2 * (length + width)));
}

void rectangle(double length, double width){
 System.out.println("Area of the Rectangle: " + (length * width));
 System.out.println("Perimeter of the Rectangle: " + (2 * (length + width)));
}



void circle(int radius){
//The value of pi is = 3.14 OR 22/7
 System.out.println("Area of Circle: " + (22/7 * radius * radius));
 System.out.println("Perimeter of Circle: " + (2 * 22/7 * radius));
}

void circle(double radius){
//The value of pi is = 3.14 OR 22/7
 System.out.println("Area of Circle: " + (22/7 * radius * radius));
 System.out.println("Perimeter of Circle: " + (2 * 22/7 * radius));
}



void triangle(int a, int b, int c, int height){
//a, b, c are sides of triangle
 System.out.println("Area of Triangle: " + (0.5 * a * height));
 System.out.println("Perimeter of Triangle: " + (a + b + c));
}

void triangle(double a, double b, double c, double height){
//a, b, c are sides of triangle
 System.out.println("Area of Triangle: " + (0.5 * a * height));
 System.out.println("Perimeter of Triangle: " + (a + b + c));
}



void rhombus(int side, int diagonal1, int diagonal2){
 double area =  0.5 * diagonal1 * diagonal2;
 System.out.println("Area of Rhombus: " + area);
 System.out.println("Perimeter of Rhombus: " + (4 * side));
}

void rhombus(double side, double diagonal1, double diagonal2){
 double area =  0.5 * diagonal1 * diagonal2;
 System.out.println("Area of Rhombus: " + area);
 System.out.println("Perimeter of Rhombus: " + (4 * side));
}



void trapezium(int base1, int base2, int side1, int side2, int height){
 double area = 0.5 * (base1 + base2) * height;
 int perimeter = base1 + base2 + side1 + side2;
 System.out.println("Area of Trapezium: " + area);
 System.out.println("Perimeter of Trapezium: " + perimeter);
}

void trapezium(double base1, double base2, double side1, double side2, double height){
 double area = 0.5 * (base1 + base2) * height;
 double perimeter = base1 + base2 + side1 + side2;
 System.out.println("Area of Trapezium: " + area);
 System.out.println("Perimeter of Trapezium: " + perimeter);
}



void parallelogram(int base, int sideLength, int height){
 System.out.println("Area of Parallelogram: " + (base * height));
 System.out.println("Perimeter of Parallelogram: " + (2 * (base + sideLength)));
}

void parallelogram(double base, double sideLength, double height){
 System.out.println("Area of Parallelogram: " + (base * height));
 System.out.println("Perimeter of Parallelogram: " + (2 * (base + sideLength)));
}



void ellipse(int a, int b){
// a = semi-major-axis and b = semi-minor-axis 
//The value of pi is = 3.14 OR 22/7
 System.out.println("Area of the Ellipse: " + (22/7 * a * b));
 System.out.println("Approximate Perimeter of the Ellipse: " + (2 * (a + b)));
}

void ellipse(double a, double b){
// a = semi-major-axis and b = semi-minor-axis 
//The value of pi is = 3.14 OR 22/7
 System.out.println("Area of the Ellipse: " + (22/7 * a * b));
 System.out.println("Approximate Perimeter of the Ellipse: " + (2 * (a + b)));
}


public static void main(String[] args){


 /* Scanner sc = new Scanner(System.in);
 System.out.print("Enter the side of square: ");
 int N = sc.nextInt(); */

//******************Objects******************

 Shape snum = new Shape();
 //snum.square(N);

 //snum.rectangle(4, 5);

 //snum.circle(4);

 //snum.triangle(2.5, 6, 4, 8.2);

 //snum.rhombus(2, 3, 6);

 //snum.trapezium(2.4, 4, 6, 3.2, 8);

 //snum.parallelogram(5, 3, 7);

 snum.ellipse(5.0, 3);















}
}