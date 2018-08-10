
package org.example.beer.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for Beer
 * <p>
 * The root of the Beer type's schema.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "style",
    "abv",
    "ibu",
    "ounces",
    "breweryId"
})
public class Beer {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("style")
    private String style;
    @JsonProperty("abv")
    private Double abv;
    @JsonProperty("ibu")
    private Double ibu;
    @JsonProperty("ounces")
    private Double ounces;
    @JsonProperty("breweryId")
    private Integer breweryId;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("style")
    public String getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(String style) {
        this.style = style;
    }

    @JsonProperty("abv")
    public Double getAbv() {
        return abv;
    }

    @JsonProperty("abv")
    public void setAbv(Double abv) {
        this.abv = abv;
    }

    @JsonProperty("ibu")
    public Double getIbu() {
        return ibu;
    }

    @JsonProperty("ibu")
    public void setIbu(Double ibu) {
        this.ibu = ibu;
    }

    @JsonProperty("ounces")
    public Double getOunces() {
        return ounces;
    }

    @JsonProperty("ounces")
    public void setOunces(Double ounces) {
        this.ounces = ounces;
    }

    @JsonProperty("breweryId")
    public Integer getBreweryId() {
        return breweryId;
    }

    @JsonProperty("breweryId")
    public void setBreweryId(Integer breweryId) {
        this.breweryId = breweryId;
    }

}
