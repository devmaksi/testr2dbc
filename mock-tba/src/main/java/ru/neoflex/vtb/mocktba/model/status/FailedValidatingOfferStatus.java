package ru.neoflex.vtb.mocktba.model.status;

public class FailedValidatingOfferStatus implements OneOfIssueCardStatusItems {
    public enum NameEnum {
        FAILEDVALIDATINGOFFERSTATUS("FailedValidatingOfferStatus");

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
    private String code = null;
    private String description = null;

    public FailedValidatingOfferStatus name(NameEnum name) {
        this.name = name;
        return this;
    }

    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    public FailedValidatingOfferStatus code(String code) {
        this.code = code;
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public FailedValidatingOfferStatus description(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "FailedValidatingOfferStatus{" +
                "name=" + name +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
