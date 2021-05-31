package com.eriskillshare;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ************Welcome to Online Calculator *********");
        System.out.println(" Enter Your Name: ");
        String name = sc.next();

        int choose ;

        do {
            System.out.println("Enter Your first Number : ");
            int num1 = sc.nextInt();

            System.out.println(" Enter Your Second Number : ");
            int numb2 = sc.nextInt();

            System.out.println("********* Choose One of the Operators *******");
            System.out.println("\n1 Addition \n2. Subtractions \n3. Multiplications \n4 Division ");
             choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("*********** Addition ***************");
                    int result = num1 + numb2;
                    System.out.println(" The Sum of those Numbers is " + result);
                    break;
                case 2:
                    System.out.println("*********** Subtractions ***************");
                    result = num1 - numb2;
                    System.out.println(" The Subtractions of those Numbers is " + result);
                    break;
                case 3:
                    System.out.println("*********** Multiplications ***************");
                    result = num1 * numb2;
                    System.out.println(" The mulipulcation of those numbers is " + result);
                    break;
                case 4:
                    System.out.println(" ********** Division ***************");
                    result = num1 / numb2;
                    System.out.println(" The Division of those numbers is " + result);
                    break;
                default:
                    System.out.println(" Please enter the valid opeartors");
            }
        }while (choose != 5);

    }
}
