package com.excellenthealthSolution.pharmacy.asset.process.finance.entity.Enum;


public enum PaymentMethod {
    CASH("Cash"),
    CREDITCARD("Card Payment"),
    CHEQUE("Cheque");

private final String paymentMethod;

    PaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
