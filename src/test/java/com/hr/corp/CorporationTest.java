package com.hr.corp;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CorporationTest {

  private Corporation corp;

  @Before
  public void setUp() throws Exception {
    corp = new Corporation("Krusty Krab", 400000);
  }

  @Test
  public void computeMonthlyTaxToPay() {
    double tax = corp.computeMonthlyTaxToPay();

    Assertions.assertThat(tax).isEqualTo(40000.0);
  }
}