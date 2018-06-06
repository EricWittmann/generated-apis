package org.example.beer.api;

import java.lang.String;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/breweries")
public interface Breweries {
  @GET
  void generatedMethod4();

  @POST
  void generatedMethod5();

  @Path("/{breweryId}")
  @GET
  void generatedMethod6();

  @Path("/{breweryId}")
  @PUT
  void generatedMethod7();

  @Path("/{breweryId}")
  @DELETE
  void generatedMethod8();

  @Path("/{breweryId}/beers")
  @GET
  void generatedMethod9(@PathParam("breweryId") String breweryId);

  @Path("/{breweryId}/beers")
  @POST
  void generatedMethod10(@PathParam("breweryId") String breweryId);

  @Path("/{breweryId}/beers")
  @DELETE
  void deleteBreweryBeers(@PathParam("breweryId") String breweryId);
}
