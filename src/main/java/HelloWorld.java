package main.java;
public class HelloWorld {

    // a single line comment
    /*
     * this is a multi-comment any info can go here
     */

     //Method signature : <access modifer> <non access modifer> <return-type> <name of method> <params>
        //Access Modifers:
     /*
      * -public: Accessible all through out the program
        -private: Can only be accessed inside of the class 
            if we want to manipulte or view the values of private fields we have to use
            getter and setter methods
         -protected: available witihng the class, by all sub classes as well as 
         by any class that is declared within the same package.
        -default:accessible in the class and in the same package.
      */
     public static int favoriteNumber(){
            return 22;
     }

     //This main method is a special method in Java. Every program needs a main method
     //in order to run. 
    // why? It is the entry point of the application.
     public static void main(String[] args){
        // this is our method implementation 

        /*
        Java is a Object Oriented language -> we create classes to act as blueprints
         and we create objects from those blueprints..
         However not everything in Java is an objects

         * There are 8 primitive types in Java
         * //Whole Numbers                                      Size 
         * byte                                                1 byte (8 bit) : -128 : 127
         * int                                                 4 bytes (32 bits): *
         * float   used for decimals                           4 bytes (32 bits): *
         * double   used for decimals                          8 bytes (64 bits): *
         * short                                                2 bytes (16 bits): -32,768: 32,767
         * long                                                  8 bytes (64 bits): *
         * 
         * single ASCII values
         * char                                                 2 bytes(16 bits)
         * 
         * boolean (true or false values)
         */

         // These are variables : portable, reusable values that also represent the state of a class
         //syntax for declaring variables: <access modifier><data type><name of the variable> = <value>

         //
         int intValue = 10000000;
         byte byteValue = 127;

         System.out.println(favoriteNumber());

     }



}