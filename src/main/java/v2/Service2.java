package v2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/api/v2")
public class Service2 {
  private static ObjectMapper jackson2 = new ObjectMapper();
  private static Map<String, Model2> models = new HashMap<>();

  @Path("/models/{name}")
  @GET
  public Model2 findModel(@PathParam("name") String name) {
    System.out.println("Jackson2: find model " + name);
    return models.get(name);
  }

  @Path("/models")
  @POST
  public Model2 createModel(Model2 model) throws JsonProcessingException {
    System.out.println("Jackson2: create model " + jackson2.writeValueAsString(model));
    models.put(model.getName(), model);
    return model;
  }
}
