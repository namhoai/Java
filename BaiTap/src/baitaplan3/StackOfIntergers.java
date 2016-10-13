/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaplan3;

/**
 *
 * @author hoain
 */
public class StackOfIntergers {
    int size = 0; 
    int []elements; 

    public StackOfIntergers() {
        elements = new int[16]; 
    }

    public StackOfIntergers(int k) {
//        this.elements = elements;
        elements = new int[k];
    }
    
    public boolean IsEmpty (){
        if (size == 0){
            return true; 
        }
        return false; 
    }
    public boolean IsFull (){
        if (size == (elements.length-1)){
            return true; 
        }
         return false; 
    }
    public int peak (){
        return elements[size]; 
    }
    public int pop (){
        int s = 0; 
        if (!IsEmpty()){
            s = elements[size]; 
            size  = size - 1;
        }else {
            System.out.println("rong ! ");
            return 0; 
        }
        return s; 
    }
    public void push (int x){
        if (!IsFull()){
            size = size +1 ; 
            elements[size] = x;
        }else {
            System.out.println(" stack day ! set them kich thuoc cho stack ");
        }
         
    }

    public int getSize() {
        return size;
    }
    
}
