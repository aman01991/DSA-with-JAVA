import java.util.Scanner;


class TestString{

static void reverseString(String str){
 System.out.println("Length of the String: " + str.length());
 System.out.print("Reversed String: ");
 String reversed = "";
 for(int i = 0; i < str.length(); i++){
 reversed = str.charAt(i) + reversed;
 }
System.out.println(reversed);
} 


static void countVowelConso(String str){
 int vowel = 0;
 int consonant = 0;
 for(int i = 0; i < str.length(); i++){
 if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || 
    str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
  vowel++;
 }
 else{
  consonant++;
 }
 }
System.out.println("Count of Vowel: " + vowel);
System.out.println("Count of Consonant: " + consonant);
}


static void countWord(String str){
 if(str.isEmpty()){
  System.out.println("Number of words: 0");
 }
 else{
  String[] words = str.split(" ");
  System.out.println("Number of words: " + words.length);
 }
}


static void palindromeCheck(String str){
 int i = 0;
 int j = str.length()-1;
 boolean isPalindrome = true;
 while(i<j){
 if(i==j){
  i++;
  j--;
 }
 else{
  isPalindrome = false;
  break;
 }
 }

 if(isPalindrome){
  System.out.println("The string is a palindrome.");
 } 
 else{
  System.out.println("The string is not a palindrome.");
 }
}


public static void main(String[] args){

 /* String str = "aman kumar";
 System.out.println(str);
 System.out.println(str.charAt(0)); */


 Scanner sc = new Scanner(System.in);
 System.out.print("Enter Charcter: ");
 String str = sc.nextLine();


 //reverseString(str);
 //countVowelConso(str);
 //countWord(str);
 //palindromeCheck(str);











}


}