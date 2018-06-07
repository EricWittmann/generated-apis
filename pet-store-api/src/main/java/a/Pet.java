package a;

import a.beans.ApiResponse;
import java.lang.Object;
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

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/pet")
public interface Pet {
  @PUT
  @Produces({"application/xml", "application/json"})
  @Consumes({"application/xml", "application/json"})
  void updatePet(a.beans.Pet body);

  @POST
  @Produces({"application/xml", "application/json"})
  @Consumes({"application/xml", "application/json"})
  void addPet(a.beans.Pet body);

  /**
   * Multiple status values can be provided with comma seperated strings
   */
  @Path("/findByStatus")
  @GET
  @Produces({"application/xml", "application/json"})
  @Consumes({"application/xml", "application/json", "multipart/form-data", "application/x-www-form-urlencoded"})
  List<a.beans.Pet> findPetsByStatus(@QueryParam("status") Object status);

  /**
   * Muliple tags can be provided with comma seperated strings. Use tag1, tag2, tag3 for testing.
   */
  @Path("/findByTags")
  @GET
  @Produces({"application/xml", "application/json"})
  List<a.beans.Pet> findPetsByTags(@QueryParam("tags") Object tags);

  /**
   * Returns a single pet.
   */
  @Path("/{petId}")
  @GET
  @Produces({"application/xml", "application/json"})
  @Consumes("application/x-www-form-urlencoded")
  a.beans.Pet getPetById(@PathParam("petId") Object petId);

  @Path("/{petId}")
  @POST
  @Produces({"application/xml", "application/json"})
  @Consumes("application/x-www-form-urlencoded")
  void updatePetWithForm(@PathParam("petId") Object petId, Object name, Object status);

  @Path("/{petId}")
  @DELETE
  @Produces({"application/xml", "application/json"})
  @Consumes({"multipart/form-data", "application/x-www-form-urlencoded"})
  void deletePet(Object api_key, @PathParam("petId") Object petId);

  @Path("/{petId}/uploadImage")
  @POST
  @Produces("application/json")
  @Consumes("multipart/form-data")
  ApiResponse uploadFile(@PathParam("petId") Object petId, Object additionalMetadata, Object file);
}
