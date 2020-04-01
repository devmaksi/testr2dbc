package ru.neoflex.vtb.mocktba.model.status;

public class Doc {

    public Doc(String name, String link){
        this.name = name;
        this.link = link;
    }

    private String name;
    private String link;

    public Doc name(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Doc link(String link) {
        this.link = link;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Doc{" +
                "name='" + name + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}