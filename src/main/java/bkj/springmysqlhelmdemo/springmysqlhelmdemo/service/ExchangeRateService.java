package bkj.springmysqlhelmdemo.springmysqlhelmdemo.service;

import bkj.springmysqlhelmdemo.springmysqlhelmdemo.model.ExchangeRate;
import bkj.springmysqlhelmdemo.springmysqlhelmdemo.repository.ExchangeRateRepository;
import org.springframework.stereotype.Service;

@Service
public class ExchangeRateService {
    private final ExchangeRateRepository exchangeRateRepository;

    public ExchangeRateService(ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateRepository = exchangeRateRepository;
    }

    public ExchangeRate addExchangeRate(ExchangeRate exchangeRate) {
        return exchangeRateRepository.save(exchangeRate);
    }

    public  double getAmount(String fromCurrency, String toCurrency) {
        ExchangeRate exchangeRate = exchangeRateRepository
                .findBySourceCurrencyAndTargetCurrency(fromCurrency,toCurrency);
        return exchangeRate == null ? 0 : exchangeRate.getAmount();
    }
}
