package com.assingment.dayfour;

import java.util.Scanner;




    class EmpWage{

            public static void main (String[]args) {
                int wageperhour = 20, fulldayhour, pay;
                Scanner input = new Scanner(System.in);
                Math math = null;
                int option = (int) (math.random() * 3);
                switch (option) {
                    case 1:
                        System.out.println("present");
                        System.out.print("Enter how many hours worked: ");
                        int hours = input.nextInt();
                        if (hours > 8) {
                            System.out.println(wageperhour * hours);
                        } else {
                            System.out.println(hours * wageperhour);

                        }
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("absent");
                        break;
                    default:
                        System.out.println("no case");}
                }
            }





