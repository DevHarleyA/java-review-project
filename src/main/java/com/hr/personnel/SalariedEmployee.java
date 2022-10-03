package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
  // Variables
  private double monthlySalary;

  // Constructors
  public SalariedEmployee() {

  }

  public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
    super(name, hireDate);
    this.monthlySalary = monthlySalary;
  }

  @Override
  public double computeMonthlyCompensation() {
    return getMonthlySalary();
  }

  @Override
  public String getEmployeeInfo() {
    return this.getName() + " was hired as a salaried employee on " + this.getHireDate() + ". They are paid " + this.getMonthlySalary() + " a month.";
  }

  // Getter and Setter Method
  public double getMonthlySalary() {
    return monthlySalary;
  }

  public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary = monthlySalary;
  }
}
