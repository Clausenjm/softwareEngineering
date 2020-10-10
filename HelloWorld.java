/**
 * Course: CS1011-051*  Fall 2020-2021*  File header contains class FirstProgram*  Name: clausenjm*  Created 9/9/2020
 */
package week1.wednesday;
import java.util.Scanner;

/***  Course CS1011-051*  Fall 2020-2021*  FirstProgram purpose: later*
 * @author clausenjm*  @version created on 9/9/2020 at 1:38 PM*/
public class HelloWorld {
    public static void main(String[] args)
            {//code for unit testing of class FirstProgram//or delete this main method
            System.out.println("hello world");
                Scanner in = new Scanner(System.in);
                System.out.println("put in a number for input test");
                int input = in.nextInt();
                System.out.println("your number is:"+"  " +input+" test successful");
         }
    }