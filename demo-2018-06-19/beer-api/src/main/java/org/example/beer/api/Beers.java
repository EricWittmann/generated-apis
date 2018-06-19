package org.example.beer.api;

import java.lang.String;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.example.beer.api.beans.Beer;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/beers")
public interface Beers {
  @GET
  @Produces("application/json")
  List<Beer> getBeers(@QueryParam("style") String style);

  @PUT
  void generatedMethod1();

  @POST
  @Consumes("application/json")
  void addBeer(Beer data);

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
  void deleteBeer(@PathParam("beerId") int beerId);
}
