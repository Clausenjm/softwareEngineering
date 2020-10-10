/**
 * Course: CS1011-051
 * Fall 2020-2021
 * File header contains class GrowthRate
 * Name: clausenjm
 * Created 10/6/2020
 */
package Week5;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Course CS1011-051
 * Fall 2020-2021
 * GrowthRate purpose: to find out the money
 * @author clausenjm
 * @version created on 10/6/2020 at 7:29 PM
 */
public class GrowthRate {
    static double optionSelected=0;
    static double option1 = Math.random()*4500+500;
    static double option2Cents = .01;
    static double option1Result= option1;
    static double op1Final = 0;
    static int weekNum = 0;
    static double weekTillDead = Math.random()*40;
   //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static void main(String[] args) {
        introduction();
        askUserOption();
        calculateRate();
        informUser();
        playAgain();
    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static void introduction(){
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("\tYour friend tells you that he is investing into a cryptocurrency and wants you to invest as well\n" +
                "before they blow up, and become main stream. He says that from his calculations it will become huge in the next 40 weeks.\n" +
                "He gives you 2 options to invest the first is with a linear growth which you will invest an amount from your savings and it will\n" +
                "add that on every week to your investment. Or you could start with 1 cent and have your investment double every week.\n" +
                "From your savings you could invest around "+ df.format(option1) +"$ for the linear. He also tells you his opion is that it\n" +
                "blow up in around "+(int)(Math.abs(weekTillDead/2))+" to "+(int)(weekTillDead*1.5)+" weeks");

    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static void askUserOption(){
        Scanner input = new Scanner(System.in);

        System.out.print("please choose between 1 & 2. 1 is linear investment while 2 is exponential: ");


        if (input.hasNextDouble()){
            double in = input.nextDouble();

            if(in == 2 || in == 1 ) {
                optionSelected = in;
            }
            else{
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("wrong value.");
                askUserOption();
            }
        }
        else{
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Wrong value");
            askUserOption();
        }

    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static void calculateRate() {
        DecimalFormat df = new DecimalFormat("#.##");
        int expoMoreLinear = weekNum;
        System.out.println("Week "+weekNum+" Linear: "+ df.format(option1Result)+ "  Exponential: "+ df.format(option2Cents));
        for (int i = 0; i< weekTillDead; i ++){

                option1Result = option1Result + option1;
                option2Cents = ((option2Cents * 100) + (option2Cents * 100)) / 100;
                weekNum++;
              if(option2Cents < option1Result+option1Result){
                  expoMoreLinear = weekNum;
                System.out.println("Week " + weekNum + " Linear: " + df.format(option1Result) + "  Exponential: " + df.format(option2Cents));
                }
              else if (option2Cents >= option1Result){
                  if (i >=weekTillDead-1) {
                       System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                       System.out.println("Looks like after "+ (expoMoreLinear)+ " from a total of "+weekNum +" weeks Exponential overtook linear");
                   }


              }
        }

        op1Final = option1Result;

    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static void informUser(){
        DecimalFormat df = new DecimalFormat("#.##");
        if(optionSelected == 1){
            if(option1Result > option2Cents){
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Awesome you chose the right option and got "+df.format((op1Final-option2Cents)) +" more $ then option 2");

            }
            else {
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("oops looks like option 2 was better and had " + df.format((option2Cents - op1Final)) + " more $ then option 1");
            }
        }
        if(optionSelected == 2){
            if(option2Cents > option1Result){
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Awesome you chose the right option and got "+df.format((option2Cents-op1Final)) +" more $ then option 1");
            }
            else {
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("oops looks like option 1 was better and had " + df.format((op1Final - option2Cents)) + " more $ then option 2");
            }
        }

    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static void playAgain(){
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to play again: y(yes)    n(no): ");
        if(input.hasNextLine()) {
            String tryAgain = input.nextLine();
            if(tryAgain.equals("y")||tryAgain.equals("Y")){
                optionSelected=0;
                option1 = Math.random()*5000;
                option2Cents = .01;
                option1Result= option1;
                op1Final = 0;
                weekNum = 0;
                weekTillDead = Math.random()*40;
                introduction();
                askUserOption();
                calculateRate();
                informUser();
                playAgain();
            }
            else if((tryAgain.equals("n")||tryAgain.equals("N"))){
                System.out.println("Thanks for playing have a good day.");
            }
            else {
                System.out.println("Wrong input");
                playAgain();
            }
        }
        else {
            System.out.println("Sorry wrong input");
            playAgain();
        }
    }
}