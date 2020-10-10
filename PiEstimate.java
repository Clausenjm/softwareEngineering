/**
 * Course: CS1011-051*  Fall 2020-2021*
 * File header contains class PiEstimate*
 * Name: clausenjm*  Created 10/4/2020
 */
package Clausenjm;
import java.util.Scanner;
import java.util.Random;
/**
 *Course CS1011-051
 *Fall 2020-2021
 *PiEstimate purpose: To estimate PI withing a circle and giving a number of points by the user.*
 *@author clausenjm
 *@version created on 10/4/2020 at 10:56 PM
 */
public class PiEstimate {
    public static void main(String[] args) {
        solveForPi();
    }

    public static void solveForPi() {
        Random rand = new Random();
        double pointsInCircle = 0;
        double amountNotOk= 0;
        Scanner N = new Scanner(System.in);
        System.out.print("Put in how many points you want to put down -1 to exit: ");
        N.hasNextDouble();
        if(N.hasNextDouble()) {
            double in = N.nextDouble();
            if (in != -1 && in >= 0) {
                for (int i = 0; i <= in; i++) {
                    double x = Math.random() * .5;
                    double y = Math.random() * .5;

                    if ((Math.pow(x, 2) + Math.pow(y, 2)) <= .25) {
                        pointsInCircle++;
                    } else
                        amountNotOk++;
                }
                System.out.println("the amount of points in the circle were: " + pointsInCircle);
                System.out.println("The amount of points out of the cirle was: " + amountNotOk);
                System.out.println("The total amount of points was: " + in);
                System.out.println("The approximation of PI is: " + (4 * pointsInCircle / in));
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                solveForPi();


            } else if (in == -1) {

            } else if (in < 0) {
                System.out.println("Sorry that was not a valid number please enter a postive interger.");
                solveForPi();
            }
        }
        else {
            System.out.println("Wrong value enter an interger");
           solveForPi();
        }
    }



}