/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class SimgleItemBox to hold the object.
 * @author Rakshita.
 * @param <T> for object.
 * 
 */
public class SingleItemBox<T> {
    /**
     * Private variable item of type T.
     */
    private T item;
    /**
     * Constructor for the object.
     * @param obj for the item in BoxUsageDemo.
     */
    public SingleItemBox(T obj){
        this.item = obj;
    }
    
    /**
     * Getter method to return the object.
     * @return item.
     */
    public T getItem(){
        return this.item;
    }
    /**
     * Main method. 
     * @param args for command line arguments.
     */
    public static void main(String[] args){
         
    }
}
