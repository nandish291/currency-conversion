package com.practice.currencyconversion.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyConversion {

  private Long id;
  private String from;
  private String to;
  private BigDecimal conversionMultiple;
  private int quantity;
  private BigDecimal totalCalculatedAmount;
  private String environment;
}
