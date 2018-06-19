
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
    "breweryId",
    "name",
    "style",
    "ibu",
    "ounces",
    "abv"
})
public class Beer {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("breweryId")
    private Integer breweryId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("style")
    private String style;
    @JsonProperty("ibu")
    private Integer ibu;
    @JsonProperty("ounces")
    private Integer ounces;
    @JsonProperty("abv")
    private Integer abv;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("breweryId")
    public Integer getBreweryId() {
        return breweryId;
    }

    @JsonProperty("breweryId")
    public void setBreweryId(Integer breweryId) {
        this.breweryId = breweryId;
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

    @JsonProperty("ibu")
    public Integer getIbu() {
        return ibu;
    }

    @JsonProperty("ibu")
    public void setIbu(Integer ibu) {
        this.ibu = ibu;
    }

    @JsonProperty("ounces")
    public Integer getOunces() {
        return ounces;
    }

    @JsonProperty("ounces")
    public void setOunces(Integer ounces) {
        this.ounces = ounces;
    }

    @JsonProperty("abv")
    public Integer getAbv() {
        return abv;
    }

    @JsonProperty("abv")
    public void setAbv(Integer abv) {
        this.abv = abv;
    }

}
