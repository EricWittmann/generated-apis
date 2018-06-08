
package org.example.rates.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "increment",
    "delete"
})
public class LimitLinks {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("self")
    private String self;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("increment")
    private String increment;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("delete")
    private String delete;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("increment")
    public String getIncrement() {
        return increment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("increment")
    public void setIncrement(String increment) {
        this.increment = increment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("delete")
    public String getDelete() {
        return delete;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("delete")
    public void setDelete(String delete) {
        this.delete = delete;
    }

}
