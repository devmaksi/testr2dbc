package ru.neoflex.vtb.mocktba.model.event;

public enum PaymentSystem {
    VISA("VISA"),
    MASTERCARD("MASTERCARD"),
    MIR("MIR");

    private String value;

    PaymentSystem(String value) {
        this.value = value;
    }

    public String toString() {
        return String.valueOf(value);
    }

    public static PaymentSystem fromValue(String text) {
        for (PaymentSystem b : PaymentSystem.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
