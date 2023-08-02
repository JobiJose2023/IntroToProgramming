package main.java.strings;

//Note: Class are created using 'PascalCasing': Every first letter of a word is capitalized

public class IntroToStrings {

    //this is a string
    //the access level of this string is default -  meaning it will be accessible in this class
     //as well as to other classes in this package
    //Why? Remember, the absence of a modifier keyword means that the modififer is default 

   // Note: Our variables and methods are written in 'camelCasing'
    
     public String helloString = "Hello Everyone!";
    

     //this is our first look at a constructor
     // a constructor is a special method
     //note the return type of this method and the name or identifier of this is
     //method are basically morphed into one. 

     //no args constructor- takes in no arguements/ params
     public IntroToStrings(){
        helloString = "I'm in the default constructor";
     }

     //this is a some args constructor because only one of the variables defined one this class
     // is set in this constructor.
    public IntroToStrings(String helloString){
        this.helloString =  helloString;
    }


    private String privateString = "Haha you can't see me!";

    //public means it will be accessible anywhere
    //static meaning: I can call it on the class itself
    public static int attendance = 61;

    public int stringCount(String value){
        return value.length();
    }

    //This is our first look at a 'getter' method;
    //A getter method (or accessor method) allows us to access
    //a value that would be otherwise inaccessible because it is defined as private
    public String getPrivateString(){
        privateString = privateString.replace('a','i');
        return privateString;
    }




    
    
}
