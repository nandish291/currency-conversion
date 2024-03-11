package com.practice.currencyconversion.service;

import com.practice.currencyconversion.feign.CurrencyExchangeFeign;
import com.practice.currencyconversion.model.CurrencyConversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CurrencyConversionService {

  @Autowired
  CurrencyExchangeFeign currencyExchangeFeign;
  public CurrencyConversion currencyConversion(String from, String to, int quantity) {
    CurrencyConversion currencyConversion = currencyExchangeFeign.exchange(from, to);
    currencyConversion.setTotalCalculatedAmount(
            currencyConversion.getConversionMultiple().multiply(BigDecimal
                    .valueOf(quantity)));
    return  currencyConversion;
  }
}
