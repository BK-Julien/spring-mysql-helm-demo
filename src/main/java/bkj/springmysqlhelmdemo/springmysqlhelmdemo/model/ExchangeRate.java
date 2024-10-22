package bkj.springmysqlhelmdemo.springmysqlhelmdemo.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.sql.Date;

@Entity @Table(name ="exchange-rate")
public class ExchangeRate {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer transactionId;
    @NotNull
    private String sourceCurrency;
    @NotNull
    private String targetCurrency;
    @NotNull
    private double amount;
    @NotNull
    private Date lastUpdated;

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setLastUpdate(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public double getAmount() {
        return amount;
    }

    public Date getLastUpdate() {
        return lastUpdated;
    }
}
