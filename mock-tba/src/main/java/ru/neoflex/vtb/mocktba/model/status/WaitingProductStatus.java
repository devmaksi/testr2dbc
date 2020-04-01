package ru.neoflex.vtb.mocktba.model.status;

public class WaitingProductStatus implements OneOfIssueCardStatusItems {
    /**
     * Gets or Sets name
     */
    public enum NameEnum {
        WAITINGPARAMSSTATUS("WaitingParamsStatus");

        private String value;

        NameEnum(String value) {
            this.value = value;
        }

        @Override
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

    public WaitingProductStatus name(NameEnum name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name.value;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WaitingProductStatus{" +
                "name=" + name +
                '}';
    }
}
