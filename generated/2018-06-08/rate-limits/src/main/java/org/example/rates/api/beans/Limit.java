
package org.example.rates.api.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "value",
    "maxValue",
    "period",
    "remainingValue",
    "resetOn",
    "createdOn",
    "modifiedOn",
    "links"
})
public class Limit {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Integer value;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("maxValue")
    private Integer maxValue;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("period")
    private Limit.Period period;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("remainingValue")
    private Integer remainingValue;
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
    @JsonProperty("createdOn")
    private String createdOn;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("modifiedOn")
    private String modifiedOn;
    @JsonProperty("links")
    private LimitLinks links;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("maxValue")
    public Integer getMaxValue() {
        return maxValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("maxValue")
    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("period")
    public Limit.Period getPeriod() {
        return period;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Limit.Period period) {
        this.period = period;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("remainingValue")
    public Integer getRemainingValue() {
        return remainingValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("remainingValue")
    public void setRemainingValue(Integer remainingValue) {
        this.remainingValue = remainingValue;
    }

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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("createdOn")
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("createdOn")
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("modifiedOn")
    public String getModifiedOn() {
        return modifiedOn;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("modifiedOn")
    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    @JsonProperty("links")
    public LimitLinks getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(LimitLinks links) {
        this.links = links;
    }

    public enum Period {

        SECOND("second"),
        MINUTE("minute"),
        HOUR("hour"),
        DAY("day"),
        MONTH("month"),
        YEAR("year");
        private final String value;
        private final static Map<String, Limit.Period> CONSTANTS = new HashMap<String, Limit.Period>();

        static {
            for (Limit.Period c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Period(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Limit.Period fromValue(String value) {
            Limit.Period constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
