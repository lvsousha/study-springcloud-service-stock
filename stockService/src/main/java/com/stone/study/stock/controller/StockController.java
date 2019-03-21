package com.stone.study.stock.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stock")
public class StockController {

  private static Integer num = 1;

  @RequestMapping(value = "/increase", method = RequestMethod.POST)
  public String increase(@RequestBody Integer number) {
    num = num + number;
    return String.valueOf(num);
  }
}
