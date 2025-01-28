/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05;

/**
 *
 * @author Tran Hieu Nghia - CE191122
 */
public class S05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyString mystring = new MyString();
        System.out.print("Enter a string: ");
        mystring.inputString();
        mystring.countLetters();
        System.out.println(mystring.toString());
    }
    
}
