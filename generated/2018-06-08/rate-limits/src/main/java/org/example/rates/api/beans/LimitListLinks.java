
package org.example.rates.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "prevPage",
    "nextPage",
    "create"
})
public class LimitListLinks {

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
    @JsonProperty("prevPage")
    private String prevPage;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nextPage")
    private String nextPage;
    @JsonProperty("create")
    private String create;

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
    @JsonProperty("prevPage")
    public String getPrevPage() {
        return prevPage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prevPage")
    public void setPrevPage(String prevPage) {
        this.prevPage = prevPage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nextPage")
    public String getNextPage() {
        return nextPage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("nextPage")
    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    @JsonProperty("create")
    public String getCreate() {
        return create;
    }

    @JsonProperty("create")
    public void setCreate(String create) {
        this.create = create;
    }

}
