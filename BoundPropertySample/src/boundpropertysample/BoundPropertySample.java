/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropertysample;

import java.util.Scanner;

/**
 *
 * @author jirap
 */
public class BoundPropertySample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPropertyBean mySource = new MyPropertyBean();
        Listener2 listener1 = new Listener2();
        Listener2 listener2 = new Listener2();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter Score ");
            String  result = input.nextLine();
            if(result.equals("")) break;
            else mySource.setValue(result);
        }
    }
}
