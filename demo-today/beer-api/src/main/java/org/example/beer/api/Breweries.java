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
import org.example.beer.api.beans.Brewery;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/breweries")
public interface Breweries {
  /**
   * Returns a list of all breweries.
   */
  @GET
  List<Brewery> getAllBreweries(@QueryParam("city") Object city, @QueryParam("state") Object state);

  /**
   * Adds a single brewery to the data set.
   */
  @POST
  void addBrewery(Brewery body);

  /**
   * Returns full information about a single brewery.
   */
  @Path("/{breweryId}")
  @GET
  Brewery getBrewery(@PathParam("breweryId") Object breweryId);

  /**
   * Updates information about a single brewery.
   */
  @Path("/{breweryId}")
  @PUT
  void updateBrewery(@PathParam("breweryId") Object breweryId, Brewery body);

  /**
   * Removes a single brewery from the data set.
   */
  @Path("/{breweryId}")
  @DELETE
  void deleteBrewery(@PathParam("breweryId") Object breweryId);

  /**
   * Returns all of the beers made by the brewery.
   */
  @Path("/{breweryId}/beers")
  @GET
  List<Beer> listBreweryBeers(@PathParam("breweryId") Object breweryId);

  /**
   * Adds a single beer to the data set for this brewery.
   */
  @Path("/{breweryId}/beers")
  @POST
  void addBeerToBrewery(@PathParam("breweryId") Object breweryId, Beer body);

  @Path("/{breweryId}/beers")
  @DELETE
  void generatedMethod1(@PathParam("breweryId") Object breweryId);
}
