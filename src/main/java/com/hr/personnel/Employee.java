package com.hr.personnel;

import com.gov.irs.TaxPayer;
import java.time.LocalDate;

public abstract class Employee implements TaxPayer {

  // Fields => private to prevent anyone from directly accessing them
  // Reason: maintainability / because of abstraction: don't want to expose implementation detail/data/state directly)
  private String name;
  private LocalDate hireDate;

  // Constructors

  public Employee() {
  }

  public Employee(String name, LocalDate hireDate) {
    this.name = name;
    this.hireDate = hireDate;
  }

  // Methods
  public abstract String getEmployeeInfo();

  public String work() {
    return name + " worked";
  }

  // Parent method that child class will override. WOn't be used directly
  public abstract double computeMonthlyCompensation();

  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }
}
