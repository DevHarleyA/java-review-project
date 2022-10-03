package com.hr.personnel;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DepartmentTest {

  private Department department;
  private SalariedEmployee joe;
  private SalariedEmployee megan;

  @Before
  public void setUp() throws Exception {
    department = new Department();
    joe = new SalariedEmployee("joe", LocalDate.of(2020, 03, 04), 3000.0);
    megan = new SalariedEmployee("megan", LocalDate.of(2020, 03, 04), 3000.0);
  }

  @Test
  public void addEmployee_test() {
    int indexBefore = department.getCurrentIndex();
    department.addEmployee(joe);
    department.addEmployee(megan);
    int indexAfter = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
    Assertions.assertThat(indexAfter).isEqualTo(indexBefore + 2);
  }

  @Test
  public void computeTotalMonthlyCompensation_test() {
    department.addEmployee(joe);
    department.addEmployee(megan);

    double totalComp = department.computeTotalMonthlyComp();

    Assertions.assertThat(totalComp).isEqualTo(6000.0);
  }

  // TODO: Finish writing this test class to test the method.
  @Test
  public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
  }
}