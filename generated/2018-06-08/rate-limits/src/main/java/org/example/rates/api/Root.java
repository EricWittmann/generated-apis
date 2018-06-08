package org.example.rates.api;

import java.lang.Object;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.example.rates.api.beans.Limit;
import org.example.rates.api.beans.LimitIncrement;
import org.example.rates.api.beans.LimitList;
import org.example.rates.api.beans.NewLimit;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/")
public interface Root {
  /**
   * Returns all limits currently being managed by the Rate Limiter API.
   */
  @GET
  @Produces("application/json")
  @Consumes("application/json")
  LimitList listLimits(@QueryParam("page") Object page, @QueryParam("pageSize") Object pageSize);

  /**
   * Creates a new rate limit to be managed by the server.
   */
  @POST
  @Produces("application/json")
  @Consumes("application/json")
  Limit createLimit(NewLimit limit);

  /**
   * Returns a limit based on a single ID.
   */
  @Path("{limitId}")
  @GET
  @Produces("application/json")
  @Consumes("application/json")
  Limit getLimit(@PathParam("limitId") Object limitId);

  /**
   * Increments a single limit.
   */
  @Path("{limitId}")
  @PUT
  @Produces("application/json")
  @Consumes("application/json")
  Limit incrementLimit(@PathParam("limitId") Object limitId, LimitIncrement increment);

  /**
   * Deletes a single limit based on the ID supplied.
   */
  @Path("{limitId}")
  @DELETE
  @Produces("application/json")
  @Consumes("application/json")
  void deleteLimit(@PathParam("limitId") Object limitId);
}
