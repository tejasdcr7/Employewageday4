package com.assingment.dayfour;

import java.util.Scanner;




    class EmpWage{

            public static void main (String[]args) {
                int i,wageperhour = 20, fulldayhour, pay,total=0,salary=0;
                Scanner input = new Scanner(System.in);
                Math math = null;
                int option = (int) (math.random() * 3);

               switch (option) {
                    case 1:
                        System.out.println("present");
                        for(i=1;i<20;i++) {
                            System.out.print("Enter how many hours worked: ");
                            int hours = input.nextInt();
                            if (hours > 8) {
                               total=wageperhour * hours;
                               salary=salary+total; //total calculation  value stored in salary
                                System.out.println(salary);

                            } else {total=wageperhour * hours;
                                salary=salary+total;
                                System.out.println(salary);

                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.println("absent");
                        break;
                    default:
                        System.out.println("no case");}
                }
            }





