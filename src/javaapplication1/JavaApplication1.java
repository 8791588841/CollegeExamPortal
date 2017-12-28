/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Himmi
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StartPage().setVisible(true);
            }
        });
        // TODO code application logic here
    }
}
