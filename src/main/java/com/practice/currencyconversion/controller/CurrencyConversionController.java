package com.practice.currencyconversion.controller;

import com.practice.currencyconversion.model.CurrencyConversion;
import com.practice.currencyconversion.service.CurrencyConversionService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

  @Autowired
  CurrencyConversionService service;

  Logger logger = LoggerFactory.getLogger(CurrencyConversionController.class);

  @GetMapping("/currency-conversion/from/{from}/to/{to}/{quantity}")
  public CurrencyConversion convertCurrency(@PathVariable String from, @PathVariable String to,
                                            @PathVariable int quantity) {
    logger.info("convertCurrency called with {} to {}"+from +"to"+ to);
    return service.currencyConversion(from, to, quantity);
  }
}
