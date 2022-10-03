package com.gov.irs;

import static org.junit.Assert.*;

import com.hr.corp.Corporation;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class IRSTest {

  private IRS irs;
  private SalariedEmployee jane;
  private HourlyEmployee francisco;
  private Corporation corp;

  @Before
  public void setUp() throws Exception {
    jane = new SalariedEmployee("Jane", LocalDate.of(2022, 4, 28), 5000.0);
    francisco = new HourlyEmployee("Francisco", LocalDate.of(2022, 5, 9), 160, 18.0);
    corp = new Corporation("Burlington", 100000.0);

    irs = new IRS();
    irs.register(jane);
    irs.register(francisco);
    irs.register(corp);
  }

  @Test
  public void computeTotalMonthlyTaxToCollect() {
    double tax = irs.computeTotalMonthlyTaxToCollect();

    Assertions.assertThat(tax).isEqualTo(12220.0);
  }
}