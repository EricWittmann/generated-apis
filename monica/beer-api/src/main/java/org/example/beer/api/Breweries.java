package org.example.beer.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/breweries")
public interface Breweries {
  @GET
  void generatedMethod2();

  @POST
  void generatedMethod3();

  @Path("/{breweryId}")
  @GET
  void generatedMethod4();

  @Path("/{breweryId}")
  @PUT
  void generatedMethod5();

  @Path("/{breweryId}")
  @DELETE
  void generatedMethod6();

  @Path("/{breweryId}/beers")
  @GET
  void generatedMethod7();

  @Path("/{breweryId}/beers")
  @POST
  void generatedMethod8();
}
