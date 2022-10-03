package com.hr.personnel;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

  private Employee employee;

  @Before
  public void setUp() throws Exception {
    // arrange => create test subject
    employee = new Employee("Alexx", LocalDate.of(2020, 01, 03));
  }

  // should return the name and hireDate
  @Test
  public void getEmployeeInfo_test() {

    // act => what we are testing
    String employeeInfo = employee.getEmployeeInfo();

    // assert => the answers should be the same
    Assert.assertEquals("name = Alexx, hireDate = 2020-01-03", employeeInfo);
    Assertions.assertThat(employeeInfo).isEqualTo("name = Alexx, hireDate = 2020-01-03");
  }

  @Test
  public void work_test() {

    String work = employee.work();
    Assertions.assertThat(work).isEqualTo("Alexx worked", work);
  }
}