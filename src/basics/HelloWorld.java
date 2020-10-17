package basics;

import javax.swing.text.StringContent;

public class HelloWorld {

    public static void main(String[] args) {

        //Stores age value
        int myAge = 28;

        myAge = myAge + 1;

        //the thing i have done here is called re-asignment, we have changed the value of myAge, it's not a duplicate, it's just a re-asignment
        //



        //Rules
        //Cannot be reserved keywords (public, static, package, void, main, int ect.)
        //Should be meaningful - Try not to use X or Y letters (unless its necessary)
        //Variable name should always start with a character (letter) - not a number (i.e. not "int 3age = 33;)
        //No spaces or hyfin between variable names (not int my_age = 33;)
        //Should be camelCase (myAge)
        //Variable names are case sensitive - i.e. "Age" is different to "age" (dont do uppercase variable names anyway)
        //Variable names should not be duplicates cause the system does not know which one to call first
        //When you create a class it has to be PascalCase (HelloWorld)
        //

        System.out.println(myAge);

    }
}