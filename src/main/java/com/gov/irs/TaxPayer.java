package com.gov.irs;

public interface TaxPayer {
  // Constants
  double HOURLY_TAX_RATE = 0.25;
  double SALARIED_TAX_RATE = 0.30;
  double CORP_TAX_RATE = 0.10;

  // Methods
  double computeMonthlyTaxToPay();
}
