/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024416;

import inpututils.InputUtils;

/**
 *
 * @author breno
 */
public class Git_2024416 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Breno Rodrigues - 2024416");
        
        // imports a package with previously written code with "tools" to ask user for input
        InputUtils myKB = new InputUtils();
        
        String userName; // stores user name
        
        /* Ask user for input (their name)
           The method "askUserForText" from "InputUtils" is one of these "tools"
           It is a loop that keeps asking for only text input and also 
           has an error message that says that only text is allowed.
        */
        userName = myKB.askUserForText("Please, type in your name.");
            
        System.out.println("That is a nice name. Lets see how it would sound without vowels:"); //print a message saying what the program will do next
        
        // Replace vowels, both uppercase and lowercase with no characters
        String nameNoVowels = userName.replaceAll("[AEIOUaeiou]","");
        
        //Prints the results 
        System.out.println(nameNoVowels);
        
    }
    
}
