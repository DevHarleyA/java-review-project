package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{

  private int hoursWorkedPerMonth;
  private double hourlyRate;

  // Constructors
  public HourlyEmployee() {

  }

  public HourlyEmployee(String name, LocalDate hireDate, int hoursWorkedPerMonth,
      double hourlyRate) {
    super(name, hireDate);
    this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    this.hourlyRate = hourlyRate;
  }

  // Override Method
  @Override
  public double computeMonthlyCompensation() {
    return hoursWorkedPerMonth * hourlyRate;
  }

  @Override
  public String getEmployeeInfo() {
    return this.getName() + " is an hourly employee who works " + this.getHoursWorkedPerMonth() + " a month for " + this.getHourlyRate() + " an hour.";
  }

  // Getters and Setters

  public int getHoursWorkedPerMonth() {
    return hoursWorkedPerMonth;
  }

  public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
    this.hoursWorkedPerMonth = hoursWorkedPerMonth;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }
}
