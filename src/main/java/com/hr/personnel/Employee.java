package com.hr.personnel;

import java.time.LocalDate;

public class Employee {

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
  public String getEmployeeInfo() {
    return "name = " + name + ", hireDate = " + hireDate;
  }

  public String work() {
    return name + " worked";
  }

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
