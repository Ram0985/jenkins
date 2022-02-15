/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * AppleOrange class.
 * @author Rakshita.
 */
public class AppleOrange {
    
    /**
     * Main method of AppleOrange class.
     * @param array for command line argument.
     */
    public static void main(String[] array) {
        // System.out.println("args length:" + args.length);
        if(array.length == 0) {
            System.err.println("One positive number required as a command line argument.\nExample Usage: java AppleOrange [number]");
        }
        if(array.length == 2) {
            System.err.println("One positive number required as a command line argument.\nExample Usage: java AppleOrange [number]");
        }
        else if(array.length == 1){
            try {
                int number = Integer.parseInt(array[0]);
                if( number <= 0){
                    System.err.println("One positive number required as a command line argument.\nExample Usage: java AppleOrange [number]");
                }
                else{
                    for(int i=1 ;i < number+1 ;++i){
                        if(i%3 == 0 && i%7 == 0){
                            System.out.print("appleorange ");
                        }
                        else if(i%7 == 0){
                            System.out.print("orange ");
                        }
                        else if (i%3 == 0){
                            System.out.print("apple ");
                        }
                        else{
                            System.out.print( i + " ");
                        }
                    }
                }
            }
            catch (NumberFormatException ex) {
                System.err.println("One positive number required as a command line argument. \nExample Usage:java AppleOrange [number] ");
            }
            catch (ArrayIndexOutOfBoundsException ex2) {
                System.err.println("One positive number required as a command line argument. \nExample Usage:java AppleOrange [number] ");
            }    
        }
    }
}
