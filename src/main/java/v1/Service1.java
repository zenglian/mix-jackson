package v1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.codehaus.jackson.map.ObjectMapper;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/api/v1")
public class Service1 {
  private static ObjectMapper jackson1 = new ObjectMapper();
  private static Map<String, Model1> models = new HashMap<>();

  @Path("/models/{name}")
  @GET
  public Model1 findModel(@PathParam("name") String name) {
    System.out.println("Jackson1: find model " + name);
    return models.get(name);
  }

  @Path("/models")
  @POST
  public Model1 createModel(Model1 model) throws IOException {
    System.out.println("Jackson1: create model " + jackson1.writeValueAsString(model));
    models.put(model.getName(), model);
    return model;
  }
}
