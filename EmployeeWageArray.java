package com.company;
import java.util.ArrayList;


public class EmployeeWageArray implements EmpWageBuilder {
    // Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private int numOfCompnaies = 0;
    private final ArrayList<ComputeEmployeeWage> computeEmployeeWageArrayList;

    public EmployeeWageArray(){
        computeEmployeeWageArrayList = new ArrayList<>();
    }

    public void addCompanyToArray(String companyName, int empRate, int numberOfWorkingDays, int numberOfWorkingHours){
        computeEmployeeWage computeEmployeeWage = new ComputeEmployeeWage(companyName, empRate, numberOfWorkingDays, numberOfWorkingHours);
			computeEmployeeWageArrayList.add(computeEmployeeWage);
        numOfCompnaies++;
    }

    public void computeEmpWage(){
        for (int i = 0; i<numOfCompnaies;i++){
            computeEmployeeWageArrayList.get[i].setTotalWage(computeEmpWagesForACompany(computeEmployeeWageArrayList.get[i]));
            System.out.println(computeEmployeeWageArrayList.get[i]);
        }
    }

    /**
     * This is a void method used to calculate the salary of the employee
     */
    private int computeEmpWagesForACompany(ComputeEmployeeWage computeEmployeeWage){

        // Variables
        int empHours = 0;
        int totalHrs = 0;
        int totalDays = 0;

        // loop condition to check if the total days are matching number of working days/hours and eventually calculate salary
        while (totalDays <= computeEmployeeWage.numberOfWorkingDays || totalHrs <= computeEmployeeWage.numberOfWorkingHours){

            totalDays++;

            // random numbers (0,1,2)
            int randomNum = (int)( Math.random() * 2 + 1);

            // selection statement
            if (randomNum == IS_FULL_TIME){
                empHours = 8;
            }
            else if (randomNum == IS_PART_TIME){
                empHours = 4;
            }
            else{
                empHours = 0;
            }

            // calculation of salary and hours
            totalHrs+=empHours;
            System.out.println("Day: " + totalDays + ", Emp Hr: " + empHours);
        }
        return totalHrs*computeEmployeeWage.empRate;
    }
}
