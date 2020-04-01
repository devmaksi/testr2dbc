package ru.neoflex.vtb.mocktba.model.status;

public class WaitingSmsConfirmationStatus implements OneOfIssueCardStatusItems {

    public enum NameEnum {
        WAITINGSMSCONFIRMATIONSTATUS("WaitingSmsConfirmationStatus");

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

    public WaitingSmsConfirmationStatus name(NameEnum name) {
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
        return "WaitingSmsConfirmationStatus{" +
                "name=" + name +
                '}';
    }
}
