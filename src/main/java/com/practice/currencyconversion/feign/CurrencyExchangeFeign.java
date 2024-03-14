package com.practice.currencyconversion.feign;

import com.practice.currencyconversion.model.CurrencyConversion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange", url = "${CURRENCY_EXCHANGE_SERVICE_HOST:http://localhost}:8000")
@FeignClient(name = "currency-exchange", url = "${CURRENCY_EXCHANGE_URI:http://localhost}:8000")
public interface CurrencyExchangeFeign {

  @GetMapping("currency-exchange/from/{from}/to/{to}")
  CurrencyConversion exchange(@PathVariable("from")String from, @PathVariable("to")String to);

}
