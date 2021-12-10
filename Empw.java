package com.assingment.dayfour;

import java.util.Scanner;




    class EmpWage{

            public static void main (String[]args){
                int wageperhr=20,fulldayhr=8;
            Scanner input = new Scanner( System.in);
            Math math = null;
            int option = (int) (math.random() * 3);
            switch (option) {
                case 1:
                    System.out.println("present");
                    System.out.println(wageperhr*fulldayhr);
                    break;
                case 2:
                    System.out.println("absent");
                    break;
                default:
                    System.out.println("no case");
            }
        }


    }


