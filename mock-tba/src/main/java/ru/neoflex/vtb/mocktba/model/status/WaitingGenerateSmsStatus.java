package ru.neoflex.vtb.mocktba.model.status;

import java.util.ArrayList;
import java.util.List;

public class WaitingGenerateSmsStatus  implements  OneOfIssueCardStatusItems{

    public enum NameEnum {
        WAITINGGENERATESMSSTATUS("WaitingGenerateSmsStatus");

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

    private List<Doc> docs = new ArrayList<Doc>();

    public WaitingGenerateSmsStatus name(NameEnum name) {
        this.name = name;
        return this;
    }


    public String getName() {
        return name.value;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    public WaitingGenerateSmsStatus docs(List<Doc> docs) {
        this.docs = docs;
        return this;
    }

    public WaitingGenerateSmsStatus addDocsItem(Doc docsItem) {
        this.docs.add(docsItem);
        return this;
    }

    public List<Doc> getDocs() {
        return docs;
    }

    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }

    @Override
    public String toString() {
        return "WaitingGenerateSmsStatus{" +
                "name=" + name +
                ", docs=" + docs +
                '}';
    }
}
