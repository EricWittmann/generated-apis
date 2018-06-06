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
import org.example.beer.api.beans.Brewery;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/breweries")
public interface Breweries {
  @GET
  @Produces("application/json")
  List<Brewery> getBreweries(@QueryParam("city") String city, @QueryParam("state") String state);

  @POST
  @Consumes("application/json")
  void addBrewery(Brewery data);

  @Path("/{breweryId}")
  @GET
  @Produces("application/json")
  Brewery getBrewery(@PathParam("breweryId") int breweryId);

  @Path("/{breweryId}")
  @PUT
  @Consumes("application/json")
  void updateBrewery(@PathParam("breweryId") int breweryId, Brewery data);

  @Path("/{breweryId}")
  @DELETE
  void deleteBrewery(@PathParam("breweryId") int breweryId);

  @Path("/{breweryId}/beers")
  @GET
  @Produces("application/json")
  List<Beer> getBreweryBeers(@PathParam("breweryId") int breweryId);
}
