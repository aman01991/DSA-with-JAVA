class Laptop{

 static String companyName;
 String modelName;
 private int price;
 protected int ram;
 int rom;

 void refreshRate(int fps){};

 void display(){
 System.out.println("Company Name: " + companyName);
 System.out.println("Model Name: " + modelName);
 System.out.println("Price: " + price);
 System.out.println("RAM: " + ram);
 System.out.println("ROM: " + rom);
 };

 void backLight(boolean key){
 if(key){
 System.out.println("It have keyboard light");
 }
 else{
 System.out.println("It doesn't have keyboard light");
 }
 }


}