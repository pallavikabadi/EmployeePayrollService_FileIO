package com.bridgelabz.Uc2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeePayrollService {
    private List<EmployeePayroll> employeePayRollList ;

    public EmployeePayrollService(List<EmployeePayroll> employeePayRollList) {
        this.employeePayRollList = employeePayRollList;
    }
    public EmployeePayrollService() {
    }
    public void readEmployeePayRollData(Scanner scannerReader) {

        System.out.println("Enter the Employee Id: ");
        int id = scannerReader.nextInt();
        System.out.println("Enter the Employee Name: ");
        String name = scannerReader.next();
        System.out.println("Enter the Salary: ");
        double salary = scannerReader.nextDouble();

        employeePayRollList.add(new EmployeePayroll(id,name,salary));
    }
    public void writeEmployeePayRollData() {

        System.out.println("Writing Employee Pay Roll Roaster to Console \n"+employeePayRollList);
    }
    public static void main(String[] args) {

        ArrayList<EmployeePayroll> employeePayRollList = new ArrayList<>();
        EmployeePayrollService employeePayRollService = new EmployeePayrollService(employeePayRollList);
        Scanner scannerReader = new Scanner(System.in);
        employeePayRollService.readEmployeePayRollData(scannerReader);
        employeePayRollService.writeEmployeePayRollData();
    }
}

