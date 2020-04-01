package ru.neoflex.vtb.mocktba.model.status;

public class ValidatingOfferStatus implements OneOfIssueCardStatusItems {
    public enum NameEnum {
        VALIDATINGOFFERSTATUS("ValidatingOfferStatus");

        private String value;

        NameEnum(String value) {
            this.value = value;
        }

        public String toString() {
            return String.valueOf(value);
        }

        public static NameEnum fromValue(String text) {
            for (NameEnum b : NameEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    private NameEnum name = null;

    public ValidatingOfferStatus name(NameEnum name) {
        this.name = name;
        return this;
    }

    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ValidatingOfferStatus{" +
                "name=" + name +
                '}';
    }
}
