package ru.neoflex.vtb.mocktba.model.event;

import java.math.BigDecimal;

public class Event {

    private String name;
    private String sms;
    private String productId ;
    private String offerId;
    private BigDecimal creditLimit;
    private Currency currency;
    private PaymentSystem paymentSystem;
    private String encryptedPin;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }

    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public String getEncryptedPin() {
        return encryptedPin;
    }

    public void setEncryptedPin(String encryptedPin) {
        this.encryptedPin = encryptedPin;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name=" + name +
                ", sms='" + sms + '\'' +
                ", productId='" + productId + '\'' +
                ", offerId='" + offerId + '\'' +
                ", creditLimit=" + creditLimit +
                ", currency=" + currency +
                ", paymentSystem=" + paymentSystem +
                ", encryptedPin='" + encryptedPin + '\'' +
                '}';
    }


}
