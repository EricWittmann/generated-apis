
package org.example.rates.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resetOn"
})
public class LimitExceededError {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("resetOn")
    private String resetOn;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("resetOn")
    public String getResetOn() {
        return resetOn;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("resetOn")
    public void setResetOn(String resetOn) {
        this.resetOn = resetOn;
    }

}
