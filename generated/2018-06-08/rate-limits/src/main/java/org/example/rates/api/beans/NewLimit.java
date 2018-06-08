
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
    "tz"
})
public class NewLimit {

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
    private NewLimit.Period period;
    @JsonProperty("tz")
    private String tz;

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
    public NewLimit.Period getPeriod() {
        return period;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("period")
    public void setPeriod(NewLimit.Period period) {
        this.period = period;
    }

    @JsonProperty("tz")
    public String getTz() {
        return tz;
    }

    @JsonProperty("tz")
    public void setTz(String tz) {
        this.tz = tz;
    }

    public enum Period {

        SECOND("second"),
        MINUTE("minute"),
        HOUR("hour"),
        DAY("day"),
        MONTH("month"),
        YEAR("year");
        private final String value;
        private final static Map<String, NewLimit.Period> CONSTANTS = new HashMap<String, NewLimit.Period>();

        static {
            for (NewLimit.Period c: values()) {
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
        public static NewLimit.Period fromValue(String value) {
            NewLimit.Period constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
