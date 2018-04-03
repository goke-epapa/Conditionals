/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionals;

/**
 *
 * @author epapa
 */
public class Conditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Block If
        if(2 > 4) {
            System.out.println("Hello World");
        }
        
        // If Else
        if(2 > 4) {
            System.out.println("Hello World");
        } else {
            System.out.println("No Hello World");
        }
        
        // If Else If
        int number = 2;
        if(number == 2) { // Morning
            System.out.println("Good Morning");
        } else if(number > 2) { // Afternoon
            System.out.println("Good Afternoon");
        } else if(number > 4) { // Afternoon
            System.out.println("Good Afternoon");
        } else if(number > 2) { // Afternoon
            System.out.println("Good Afternoon");
        } 
    }
    
}
