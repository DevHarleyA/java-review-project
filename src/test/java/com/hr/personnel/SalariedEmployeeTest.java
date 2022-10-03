package com.hr.personnel;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee george;

  @Before
  public void setUp() throws Exception {
    george = new SalariedEmployee("George",
        LocalDate.of(2022, 5, 28), 3000);
  }

  @Test
  public void computeMonthlyCompensation_test() {
    double georgeMonthly = george.computeMonthlyCompensation();

    Assertions.assertThat(georgeMonthly).isEqualTo(3000.0);
  }

  @Test
  public void getInfo_test() {
    String info = george.getEmployeeInfo();

    Assertions.assertThat(info).isEqualTo("George was hired as a salaried employee on 2022-05-28. They are paid 3000.0 a month.");
  }

  @Test
  public void computeMonthly_test() {
    double tax = george.computeMonthlyTaxToPay();

    Assertions.assertThat(tax).isEqualTo(900);
  }
}