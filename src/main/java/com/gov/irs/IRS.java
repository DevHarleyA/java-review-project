package com.gov.irs;

public class IRS {

  // fields
  private TaxPayer[] taxPayers = new TaxPayer[100];
  private int currentIndex = 0; // for dealing with the array

  // Constructor


  public IRS() {
  }

  public IRS(TaxPayer[] taxPayers, int currentIndex) {
    this.taxPayers = taxPayers;
    this.currentIndex = currentIndex;
  }

  public void register(TaxPayer taxPayer) {
    taxPayers[currentIndex++] = taxPayer;
  }

  public double computeTotalMonthlyTaxToCollect() {
    double totalMonthlyTaxToCollect = 0.0;

    for (int i = 0; i < currentIndex; i++) {
      double monthlyTaxToPay = taxPayers[i].computeMonthlyTaxToPay();
      totalMonthlyTaxToCollect += monthlyTaxToPay;
    }

    return totalMonthlyTaxToCollect;
  }
}
