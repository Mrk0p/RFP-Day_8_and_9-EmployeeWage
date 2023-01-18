package com.bridgelabz.employee_wage_opps;

import java.util.Random;

public class EmployeeWage {

    public static int fullDayHours = 8;
    public static int halfDayHours = 4;

    private final String companyName;
    private final int WagePerHour;
    private final int workingHours;
    private final int workingDays;

    public EmployeeWage(String companyName, int wagePerHour, int workingHours, int workingDays) {
        this.companyName = companyName;
        this.WagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.workingHours = workingHours;

    }
    public int calculateWage() {
        int dailywage = 0;
        int totalWage = 0;
        int totalWorkingHours = 0;
        int days = 0;

        Random random = new Random();

        while (totalWorkingHours <= workingHours && days <= workingDays) {
            days++;
            int empCheck = random.nextInt(3);


            switch (empCheck) {
                case 1:

                    System.out.println("Present Fullday.");
                    dailywage = WagePerHour * fullDayHours;
                    totalWorkingHours = totalWorkingHours + fullDayHours;
                    break;
                case 2:

                    System.out.println("Present HalfDay.");
                    dailywage = WagePerHour * halfDayHours;
                    totalWorkingHours = totalWorkingHours + halfDayHours;
                    break;
                default:
                    System.out.println("Employee Absent"); // printed
            }

            System.out.print("Day: " + days + empCheck + " ");
            System.out.print("Working Hours: " + totalWorkingHours + " ");
            System.out.print("Daily wage is: " + dailywage + " ");
            totalWage = totalWage + dailywage;
        }
        return totalWorkingHours * WagePerHour;

    }

    public static void main(String[] args) {

        EmployeeWage Nike = new EmployeeWage("Nike",25,100,20);

        EmployeeWage Adidas = new EmployeeWage("Adidas",22,95,22);

        EmployeeWage Puma =  new EmployeeWage("Puma",20,90,25);

        System.out.println("Total employee's wage of company :"+Nike.companyName+"-"+Nike.calculateWage());

        System.out.println("Total employee's wage of company :"+Adidas.companyName+"-"+Adidas.calculateWage());

        System.out.println("Total employee's wage of company :"+Puma.companyName+"-"+Puma.calculateWage());
    }
}
