package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

public class HRClient {

  public static void main(String[] args) {

//    Employee employee1 = new Employee();
//    employee1.setName("Alexx");
//    employee1.setHireDate(LocalDate.of(2022, 7, 5));
//    String employeeInfo1 = employee1.getEmployeeInfo();
//    System.out.println("employee1 info = " + employeeInfo1);
//
//    Employee employee2 = new Employee("mary", LocalDate.of(1900, 03, 05));
//    String employeeInfo2 = employee2.getEmployeeInfo();
//    System.out.println("employee2 info = " + employeeInfo2);

    SalariedEmployee salariedEmployee = new SalariedEmployee();
    salariedEmployee.setMonthlySalary(2000.00);
    salariedEmployee.setName("Alexx");
    salariedEmployee.setHireDate(LocalDate.of(2022, 07, 05));
    String employeeInfo1 = salariedEmployee.getEmployeeInfo();
    System.out.println("salaried employee1 = " + employeeInfo1);

    SalariedEmployee salariedEmployee2 = new SalariedEmployee("Joe", LocalDate.of(2020, 03, 04), 3000.0);
    System.out.println("salaried employee2 = " + salariedEmployee2.getEmployeeInfo());

    HourlyEmployee hourlyEmployee = new HourlyEmployee();
    hourlyEmployee.setHoursWorkedPerMonth(100);
    hourlyEmployee.setHourlyRate(20);
    hourlyEmployee.setName("Bob");
    String employeeInfo2 = hourlyEmployee.getEmployeeInfo();
    System.out.println("hourly employee = " + employeeInfo2);

    Department department = new Department();
    department.addEmployee(salariedEmployee);
    department.addEmployee(salariedEmployee2);
    department.addEmployee(hourlyEmployee);
    int numOfEmployees = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
    System.out.println("number of employees worked = " + numOfEmployees);

    int numWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
    System.out.println(numWorked);

    double totalMonthlyComp = department.computeTotalMonthlyComp();
    System.out.println("Department total compensation = " + totalMonthlyComp);

  }
}
