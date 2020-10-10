/**
 * Course: CS1011-051*  Fall 2020-2021*
 * File header contains class taxBracket*
 * Name: clausenjm*  Created 9/23/2020
 */
package Week3.wensday;
import java.text.DecimalFormat;
import java.util.Scanner;
/***  Course CS1011-051*  Fall 2020-2021*  taxBracket purpose:
 to calculate your taxes*  @author clausenjm*  @version created on 9/23/2020 at 12:59 PM*/
public class TaxBracket {
    public static void main(String[] args) {
    userIsJointSingle();
    }

    public static void taxPaidSingle(double x){
      DecimalFormat df = new DecimalFormat("#.##");
        double outcome;
      double percent;
        double pCent10= 9700*.10;
        double pCent12= 29775*.12;
        double pCent22= 44725*.22;
        double pCent24=  76525*.24;
        double pCent32=  43375*.32;
        double pCent35= 306200*.35;
        if(x <= 9700) {
            //10%
            outcome = x * .10;
            System.out.println(outcome);
            System.out.println("Your estimated taxes for 2019 are: $"+outcome);
            percent = ((outcome/x)*100);
            System.out.print("This results in an "+df.format(percent)+"% effective tax rate");
        }
        else if( x<39475){
            //12%
            outcome = pCent10 + ((x-9700)*.12);
            System.out.println("Your estimated taxes for 2019 are: $"+outcome);
            percent = ((outcome/x)*100);
            System.out.print("This results in an "+df.format(percent)+"% effective tax rate");
        }
        else if( x<84200){
            //at 22%
            outcome = pCent10 + pCent12+((x-39475)*.22);
            System.out.println("Your estimated taxes for 2019 are: $"+outcome);
            percent = ((outcome/x)*100);
            System.out.print("This results in an "+df.format(percent)+"% effective tax rate");
        }
        else if( x<160725){
            //at 24%
            outcome = pCent10 + pCent12 + pCent22 +((x-84200)*.24);
            System.out.println("Your estimated taxes for 2019 are: $"+outcome);
            percent = ((outcome/x)*100);
            System.out.print("This results in an "+df.format(percent)+"% effective tax rate");
        }
        else if( x<204100){
            //32%
            outcome = pCent10 + pCent12 + pCent22 + pCent24 + ((x-160725)*.32);
            System.out.println("Your estimated taxes for 2019 are: $"+outcome);
            percent = ((outcome/x)*100);
            System.out.print("This results in an "+df.format(percent)+"% effective tax rate");
        }else if( x<510300){
            //35%
            outcome = pCent10 + pCent12 + pCent22 + pCent24 + pCent32 +((x-204100)*.35);
            System.out.println("Your estimated taxes for 2019 are: $"+outcome);
            percent = ((outcome/x)*100);
            System.out.print("This results in an "+df.format(percent)+"% effective tax rate");
        }
        else if( x >= 510301){
            //37%
        outcome = pCent10 + pCent12 + pCent22 + pCent24 + pCent32 + pCent35 +((x-510300)*.37);
            System.out.println("Your estimated taxes for 2019 are: $"+outcome);
            percent = ((outcome/x)*100);
            System.out.print("This results in an "+df.format(percent)+"% effective tax rate");
        }


    }

    public static void taxPaidJoint(double x){
        DecimalFormat df = new DecimalFormat("#.##");
        double outcome;
        double percent;
        double pDCent10= 19400*.10;
        double pDCent12= 59550*.12;
        double pDCent22= 89450*.22;
        double pDCent24= 153050*.24;
        double pDCent32= 86750*.32;
        double pDCent35= 204150*.35;
        if(x <= 19400) {
            //10%
            outcome = x * .10;
            System.out.println("Your estimated taxes for 2019 are: $"+df.format(outcome));
            percent = ((outcome/x)*100);
            System.out.println("This results in an "+df.format(percent)+"% effective tax rate");
        }
        else if( x<78950){
            //12%
            outcome = pDCent10+((x-19400)*.12);
            System.out.println("Your estimated taxes for 2019 are: $"+df.format(outcome));
            percent = ((outcome/x)*100);
            System.out.println("This results in an "+df.format(percent)+"% effective tax rate");
        }
        else if( x<168400){
            //at 22%
            outcome = pDCent10 + pDCent12 + ((x-78950)*.22);
            System.out.println("Your estimated taxes for 2019 are: $"+df.format(outcome));
            percent = ((outcome/x)*100);
            System.out.println("This results in an "+df.format(percent)+"% effective tax rate");
        }
        else if( x<321450){
            //at 24%
            outcome = pDCent10+ pDCent12 + pDCent22 +((x-168400)*.24);
            System.out.println("Your estimated taxes for 2019 are: $"+df.format(outcome));
            percent = ((outcome/x)*100);
            System.out.println("This results in an "+df.format(percent)+"% effective tax rate");
        }
        else if( x<408200){
            //32%
            outcome = pDCent10+ pDCent12 + pDCent22  +pDCent24+((x-321450)*.32);
            System.out.println("Your estimated taxes for 2019 are: $"+df.format(outcome));
            percent = ((outcome/x)*100);
            System.out.println("This results in an "+df.format(percent)+"% effective tax rate");
        }else if( x<612350){
            //35%
            outcome = pDCent10+ pDCent12 + pDCent22  + pDCent24 +204101*.32+((x-408200)*.35);
            System.out.println("Your estimated taxes for 2019 are: $"+df.format(outcome));
            percent = ((outcome/x)*100);
            System.out.println("This results in an "+df.format(percent)+"% effective tax rate");
        }
        else if( x >= 612351){
            //37%
            outcome = pDCent10+ pDCent12 + pDCent22  +pDCent24 +pDCent32+pDCent35+((x-612350)*.37);
            System.out.println("Your estimated taxes for 2019 are: $"+df.format(outcome));
            percent = ((outcome/x)*100);
            System.out.println("This results in an "+df.format(percent)+"% effective tax rate");
        }



    }

    public static void userIsJointSingle(){
        Scanner answer = new Scanner(System.in);
        System.out.println("Are you a single or married joint tax payer? s = Single , j = Joint ");
        String in = answer.nextLine();
        if(in.equals("s") || in.equals("S")){
            System.out.println("Now put in you yearly income.");
            double sTax = answer.nextDouble();
            taxPaidSingle(sTax);
        }
        else if (in.equals("j") || in.equals("J")){
            System.out.println("Now put in you yearly income.");
            double dTax = answer.nextDouble();
            taxPaidJoint(dTax);
        }
    }

}