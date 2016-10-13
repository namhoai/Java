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
public class StackOfChars {

    int size = 0;
    char [] elements;

    public StackOfChars() {
        elements = new char [16];
    }

    public StackOfChars(int k) {
        elements = new char [k];
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public boolean IsFull() {
        if (size == (elements.length - 1)) {
            return true;
        }
        return false;
    }

    public char peak() {
        return elements[size];
    }

    public char pop() {
        char s = 0;
        if (!IsEmpty()) {
            s = elements[size];
            size = size - 1;
        } else {
            System.out.println("rong ! ");
            return 0;
        }
        return s;
    }

    public void push(char x) {
        if (!IsFull()) {
            size = size + 1;
            elements[size] = x;
        } else {
            System.out.println(" stack day ! set them kich thuoc cho stack ");
        }

    }

    public int getSize() {
        return size;
    }
    
    public static int precedence(char x)
    {
        if(x=='(')
            return 0;
        if(x=='+'||x=='-')
            return 1;
        if(x=='*'||x=='/'||x=='%')
            return 2;
        return 3;
    }
}
