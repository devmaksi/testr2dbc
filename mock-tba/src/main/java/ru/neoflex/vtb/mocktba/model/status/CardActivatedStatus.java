package ru.neoflex.vtb.mocktba.model.status;

public class CardActivatedStatus implements OneOfIssueCardStatusItems {

    public enum NameEnum {
        CARDACTIVATEDSTATUS("CardActivatedStatus");

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

    private NameEnum name;


    public String getName() {
        return name.value;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CardActivatedStatus{" +
                "name=" + name +
                '}';
    }
}
