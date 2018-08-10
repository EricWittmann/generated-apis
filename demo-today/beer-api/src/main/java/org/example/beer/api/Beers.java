package org.example.beer.api;

import java.lang.Object;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import org.example.beer.api.beans.Beer;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/beers")
public interface Beers {
  /**
   * Returns all of the beers.
   */
  @GET
  List<Beer> getAllBeers(@QueryParam("style") Object style);

  /**
   * Adds a beer to the data set.
   */
  @POST
  void addBeer(Beer body);

  /**
   * Returns full information about a single beer.
   */
  @Path("/{beerId}")
  @GET
  Beer getBeer(@PathParam("beerId") Object beerId);

  /**
   * Updates information about a single beer.
   */
  @Path("/{beerId}")
  @PUT
  void updateBeer(@PathParam("beerId") Object beerId, Beer body);

  /**
   * Removes a single beer from the data set.
   */
  @Path("/{beerId}")
  @DELETE
  void deleteBeer(@PathParam("beerId") Object beerId);
}
