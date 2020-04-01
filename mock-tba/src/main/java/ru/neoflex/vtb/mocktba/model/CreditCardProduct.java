package ru.neoflex.vtb.mocktba.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
public class CreditCardProduct   {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("image")
    private String image;
    @JsonProperty("creditLimit")
    private int creditLimit;
    @JsonProperty("options")
    @Valid
    private List<CreditCardProductOptions> options;
    @JsonProperty("bonuses")
    @Valid
    private List<CreditCardProductBonuses> bonuses;

    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @NotNull
    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Valid
    @NotNull
    public List<CreditCardProductOptions> getOptions() {
        return options;
    }

    public void setOptions(List<CreditCardProductOptions> options) {
        this.options = options;
    }

    @Valid
    public List<CreditCardProductBonuses> getBonuses() {
        return bonuses;
    }

    public void setBonuses(List<CreditCardProductBonuses> bonuses) {
        this.bonuses = bonuses;
    }

    @Override
    public String toString() {
        return "CreditCardProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", creditLimit=" + creditLimit +
                ", options=" + options +
                ", bonuses=" + bonuses +
                '}';
    }
}

