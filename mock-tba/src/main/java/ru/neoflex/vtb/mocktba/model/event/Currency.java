package ru.neoflex.vtb.mocktba.model.event;

public enum Currency {
    EUR("EUR"),
    USD("USD"),
    RUB("RUB");

    private String value;

    Currency(String value) {
        this.value = value;
    }

    public String toString() {
        return String.valueOf(value);
    }

    public static Currency fromValue(String text) {
        for (Currency b : Currency.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
