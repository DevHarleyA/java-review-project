package com.hr.personnel;

import java.util.ArrayList;
import java.util.List;

public class Department {

  // Fields
  private String name;
  private String location;
  private List<Employee> employees = new ArrayList<>();
  private int currentIndex = 0;

  // Methods
  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
    int num = 0;

    for (Employee employee : employees) {
      if (employee.work().contains("worked")) {
        num++;
      }
    }
    return num;
  }

  public double computeTotalMonthlyComp() {

    double monthlyTotalCompensation = 0.0;

    for (Employee employee: employees) {
      monthlyTotalCompensation += employee.computeMonthlyCompensation();
    }

    return monthlyTotalCompensation;
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  public int getCurrentIndex() {
    return currentIndex;
  }

  public void setCurrentIndex(int currentIndex) {
    this.currentIndex = currentIndex;
  }
}
