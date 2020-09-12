/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballboundproperty;

import java.util.Scanner;

/**
 *
 * @author amam
 */
public class FootballBoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFootballPropertyBean mySource = new MyFootballPropertyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Score : ");
            String result = sc.nextLine();
            if (result.equals("")) {
                break;
            }
            mySource.setFootballResult(result);
        }
    }
}
