package bkj.springmysqlhelmdemo.springmysqlhelmdemo.controller;

import bkj.springmysqlhelmdemo.springmysqlhelmdemo.model.ExchangeRate;
import bkj.springmysqlhelmdemo.springmysqlhelmdemo.service.ExchangeRateService;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping(path = "/api")
public class ExchangeRateController {
    private final ExchangeRateService exchangeRateService;

    public ExchangeRateController(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    @GetMapping("/amounts")
    public double getAmount(@RequestParam String fromCurrency, @RequestParam String toCurrency) {
        return exchangeRateService.getAmount(fromCurrency, toCurrency);
    }

    @PostMapping("/addExchangeRate")
    public ExchangeRate addExchangeRate(@RequestBody ExchangeRate exchangeRate) {
        return exchangeRateService.addExchangeRate(exchangeRate);
    }
}
