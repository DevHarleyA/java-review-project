package com.hr.personnel;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class HourlyEmployeeTest {

  private HourlyEmployee helen;

  @Before
  public void setUp() throws Exception {
    helen = new HourlyEmployee("Helen", LocalDate.of(1993, 4, 28),
        160, 20.0);
  }

  @Test
  public void computeMonthlyCompensation_test() {
    double helenComp = helen.computeMonthlyCompensation();
    Assertions.assertThat(helenComp).isEqualTo(3200);
  }

  @Test
  public void getInfo_test() {
    String info = helen.getEmployeeInfo();

    Assertions.assertThat(info).isEqualTo("Helen is an hourly employee who works 160 a month for 20.0 an hour.");
  }

  @Test
  public void computeMonthly_test() {
    double tax = helen.computeMonthlyTaxToPay();

    Assertions.assertThat(tax).isEqualTo(800);
  }
}