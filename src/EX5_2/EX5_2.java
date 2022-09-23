/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX5_2;

import java.util.*;

/**
 *
 * @author athap
 */
public class EX5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LiveScoreBean scorebean = new LiveScoreBean();
        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();
        scorebean.addPropertyChangeListener(subscriber1);
        scorebean.addPropertyChangeListener(subscriber2);

        while (true) {
            System.out.println("Enter Score ");
            String input = sc.nextLine();
            if ("".equalsIgnoreCase(input)) {
                break;
            }
            scorebean.setScoreLine(input);
        }

    }

}
