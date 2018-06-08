package org.example.beer.api;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.example.beer.api.beans.Beer;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/beers")
public interface Beers {
  @Path("/{beerId}")
  @GET
  @Produces("application/json")
  Beer getBeer(@PathParam("beerId") int beerId);

  @Path("/{beerId}")
  @PUT
  @Consumes("application/json")
  void updateBeer(@PathParam("beerId") int beerId, Beer data);

  @Path("/{beerId}")
  @DELETE
  void generatedMethod1(@PathParam("beerId") int beerId);

  /**
   * Returns all of the beers in the database.
   */
  @GET
  @Produces("application/json")
  List<Beer> getAllBeers();

  /**
   * Adds a single beer to the dataset.
   */
  @POST
  @Consumes("application/json")
  void createABeer(Beer data);
}
