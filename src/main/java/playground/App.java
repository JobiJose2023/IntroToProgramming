package main.java.playground;

import main.java.HelloWorld;
import main.java.strings.IntroToStrings;
//Note: The Object is the parent class for ALL aobjets created in Java. 
public class App {

   public static void main(String[] args){

    
    //this variable has a static non access modifier
   //  System.out.println(IntroToStrings.attendance);
  
   //   String welcome = stringsClass.helloString;
    // String hello = "Hello Everyone!";
    // String hello2 = new String("hello everyone!");

    // System.out.println(stringsClass.stringCount(welcome));

    //Note: = denotes assignment VS. == denotes comparison 
       
    // System.out.println(welcome.equalsIgnoreCase(hello2));

    //.equals allows us to compare strings regardless of their memory locations
    //if we use == on an impicit String definition , and compare it to a string
    // that is definied using the 'new' keyword , even if they are the same
    //we will get a false return. For that reason we have the equals method.

    // .equalsIgnoreCase() - this method allows us to compare strings
    //regardless of their casing.
     
   //  int favNum = HelloWorld.favoriteNumber();
   //  System.out.println(favNum);
    //because the favoriteNumber method has the static non access modifier in its signature
    //we are able to call the method on the class itself.
   //  System.out.println(HelloWorld.favoriteNumber());

   IntroToStrings stringsClass = new IntroToStrings();
   IntroToStrings stringClass2 = new IntroToStrings("Day 3 Was Great!");

   System.out.println(stringsClass.helloString);
   System.out.println(stringClass2.helloString);

   System.out.println(stringsClass.attendance);
   System.out.println(stringClass2.attendance);

   stringClass2.attendance += 7;

   System.out.println(stringsClass.attendance);





   }
}
