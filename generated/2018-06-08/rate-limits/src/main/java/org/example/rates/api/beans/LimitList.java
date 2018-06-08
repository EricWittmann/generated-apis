
package org.example.rates.api.beans;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "page",
    "pageSize",
    "limits",
    "links"
})
public class LimitList {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pageSize")
    private Integer pageSize;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limits")
    private List<Limit> limits = new ArrayList<Limit>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("links")
    private LimitListLinks links;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pageSize")
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pageSize")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limits")
    public List<Limit> getLimits() {
        return limits;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("limits")
    public void setLimits(List<Limit> limits) {
        this.limits = limits;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("links")
    public LimitListLinks getLinks() {
        return links;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("links")
    public void setLinks(LimitListLinks links) {
        this.links = links;
    }

}
