
package org.example.rates.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "incrementBy"
})
public class LimitIncrement {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("incrementBy")
    private Integer incrementBy;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("incrementBy")
    public Integer getIncrementBy() {
        return incrementBy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("incrementBy")
    public void setIncrementBy(Integer incrementBy) {
        this.incrementBy = incrementBy;
    }

}
