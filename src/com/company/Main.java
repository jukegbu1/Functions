package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int hoursWorked = keyboard.nextInt();

        double payRate = 45;
        int otHours = hoursWorked - 40;


        //employees work more than 40hrs
            if (hoursWorked > 40){
            double otPay = (otHours) * (payRate * 1.5);
            double wages = (otPay) + (40 * payRate);

            //employees who work no overtime
        } else if (hoursWorked <= 40){
            double wkPay = (hoursWorked) * (payRate);
        }

            //calculation for sick leave
        double sickLeave = 0;
        double totalHours = (hoursWorked + otHours);

        if (totalHours >= 100)
        {sickLeave = (sickLeave +2.5);}

        if (totalHours >= 300)
        {sickLeave = (sickLeave +4.5);}

        if (totalHours >= 500)
        {sickLeave = (sickLeave +5);}

    }
}