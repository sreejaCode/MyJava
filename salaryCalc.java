package Sreeja;

import java.util.Scanner;

public class salaryCalc {
	
	public static int employeeSalary(int hrsWorked,int holidays,int hourlyWage) {
		
		int ActualHrsWorked = hrsWorked- (holidays*8);
		System.out.println("Actual Hours Worked: " + ActualHrsWorked);
		int salary= hourlyWage * ActualHrsWorked;
		return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total number of hours worked: ");
        int data1 = input.nextInt();
        
        System.out.println("Enter the hourly wage:");
        int data2= input.nextInt();
        
        System.out.println("Enter the number of holidays:");
        int data3= input.nextInt();
        
        input.close();
        
        int empSalary= employeeSalary(data1,data3,data2 );
      	System.out.println("Employee Salary: " + empSalary);
	}

}
