package bkj.springmysqlhelmdemo.springmysqlhelmdemo.repository;

import bkj.springmysqlhelmdemo.springmysqlhelmdemo.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Integer> {
    ExchangeRate findBySourceCurrencyAndTargetCurrency(String sourceCurrency, String targetCurrency);
}
