package ru.neoflex.vtb.mocktba.model.status;

public class ActivatingCardStatus implements OneOfIssueCardStatusItems {
    public enum NameEnum {
        ACTIVATINGCARDSTATUS("ActivatingCardStatus");

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

    public ActivatingCardStatus name(NameEnum name) {
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
        return "ActivatingCardStatus{" +
                "name=" + name +
                '}';
    }
}
