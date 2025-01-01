class Driver{


 private int a = 5;


public static void main(String[] args){


 Driver d1 = new Driver();
 System.out.println("a = " + d1.a + " (It can be accessible in the same class only)");
 System.out.println("--------------");



 Laptop hp1 = new Laptop();
 hp1.companyName = "HP";
 hp1.modelName = "HP01DX4";
 //hp1.price = 60000;
 hp1.ram = 8;
 hp1.rom = 256;

 /* System.out.println(hp1.companyName + " " + hp1.modelName);
 System.out.println(hp1.price);
 System.out.println(hp1.ram + " " + hp1.rom); */


 //hp1.foldable();
 hp1.display();
 hp1.backLight(false);



 Laptop hp2 = new Laptop();
 hp2.companyName = "Dell";
 hp2.modelName = "HP01Degjo";
 //hp2.price = 600;
 hp2.ram = 12;
 hp2.rom = 512;

 System.out.println("--------------");
 hp2.display();


 System.out.println("--------------");
 hp1.display();





}


}