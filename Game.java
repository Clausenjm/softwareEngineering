/**
 * Course: CS1011-051*  Fall 2020-2021*
 * File header contains class Game*
 * Name: clausenjm*  Created 9/17/2020
 */
package Week2.wensday;
import java.util.Scanner;
/***  Course CS1011-051*  Fall 2020-2021*  Game purpose:
 a guessing game*  @author clausenjm*  @version created on 9/17/2020 at 8:37 AM*/
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess = (int) (Math.random()*20+1);
        System.out.print(guess);
        boolean is = true;
        System.out.println("I am guessing a number from 1 to 20 you have to guess. \nI will tell you if you need to go up or down in you guess. type 0 to quit");
        while(is) {
            int inputAnswer = input.nextInt();
            if(inputAnswer == guess){
                is = false;
                System.out.println("Awesome you guessed it do you want to play again 0 = no : 1 = yes");
                int yesNo = input.nextInt();
                if (yesNo == 1){
                  is = true;
                  System.out.print("I am guessing a new number.");
                }
                else {
                    is = false;
                System.out.println("Ok have a nice day.");
                }
            }
            else if (inputAnswer > guess){
                System.out.println("oops that's too high guess lower.");
            }
            else if (inputAnswer < guess && inputAnswer >0){
                System.out.println("oops that's too low guess higher.");
            }
            else if (inputAnswer == 0){
                is =false;
                System.out.println("have a nice day");
            }
        }
    }
}