//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.reem; //just name space

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("What would you like to convert?");
            System.out.println("1. SAR to USD");
            System.out.println("2. USD to SAR");
            System.out.println("3. EUR to SAR");
            System.out.println("4. SAR to EUR");
            System.out.println("5.  Exit");

       int choice = scanner.nextInt();

            switch (choice) {

                case 1:
            final float sarInUsd = (float) 0.27;
            System.out.println ("Enter the SAR to convert to USD:");
            float sarAmount = scanner.nextFloat();
            float convertSarToUsd = sarAmount * sarInUsd;
            System.out.println("The result is:" + " "+ convertSarToUsd +" "+ "USD");
            break;


               case 2:
            final float usdInSar = 3.75F;
            System.out.println ("Enter the USD to convert to SAR:");
            float usdAmount = scanner.nextFloat();
            float convertUsdToSar = usdAmount * usdInSar;
            System.out.println("The result is:"+ " " + convertUsdToSar + " "+ "SAR");
            break;


                case 3:
            final float eurInSar= 4.10F;
            System.out.println ("Enter the EUR to convert to SAR:");
            float eurAmount = scanner.nextFloat();
            float convertEurToSar = eurAmount * eurInSar;
            System.out.println("The result is:"+ " " + convertEurToSar + " "+ "SAR");
            break;


                case 4:
            final float sarInEur = 0.24F;
            System.out.println ("Enter the SAR to convert to EUR:");
            float amountSar = scanner.nextFloat();
            float convertSarToEur = amountSar * sarInEur;
            System.out.println("The result is:"+ " " + convertSarToEur + " "+ "EUR");
            break;

                case 5:
                    running = false;
                    break;

                }
            }
        }
    }

