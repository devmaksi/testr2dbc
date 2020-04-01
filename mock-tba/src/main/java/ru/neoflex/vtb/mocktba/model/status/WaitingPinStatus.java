package ru.neoflex.vtb.mocktba.model.status;

public class WaitingPinStatus implements OneOfIssueCardStatusItems {

    public enum NameEnum {
        WAITINGPINSTATUS("WaitingPinStatus");

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
    private String rsaPubKey;

    public String getName() {
        return name.value;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    public WaitingPinStatus rsaPubKey(String rsaPubKey) {
        this.rsaPubKey = rsaPubKey;
        return this;
    }

    public String getRsaPubKey() {
        return rsaPubKey;
    }

    public void setRsaPubKey(String rsaPubKey) {
        this.rsaPubKey = rsaPubKey;
    }

    @Override
    public String toString() {
        return "WaitingPinStatus{" +
                "name=" + name +
                ", rsaPubKey='" + rsaPubKey + '\'' +
                '}';
    }
}
