package main.java.strings;

//Note: Class are created using 'PascalCasing': Every first letter of a word is capitalized

public class IntroToStrings {

    //this is a string
    //the access level of this string is default -  meaning it will be accessible in this class
     //as well as to other classes in this package
    //Why? Remember, the absence of a modifier keyword means that the modififer is default 

   // Note: Our variables and methods are written in 'camelCasing'
    
     public String helloString = "Hello Everyone!";

    private String privateString = "Haha you can see me!";

    //public means it will be accessible anywhere
    //static meaning: I can call it on the class itself
    public static int attendance = 61;

    public int stringCount(String input){
        return input.length();
    }


    
    
}
