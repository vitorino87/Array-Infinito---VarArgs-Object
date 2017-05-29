/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargs.object;

/**
 *
 * @author tiago.lucas
 */
public class VarArgsObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printAll(2,"two",4,"four",4.5,"four point five",true,"true");
        printAll();
        printAll(25,"Anything goes",true,4E4,false);
    }
    public static void printAll(Object... args){
        for(Object arg:args){
            System.out.print(" "+arg);
        }
        System.out.println();
    }
}
