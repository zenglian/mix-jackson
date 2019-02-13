package v2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;
import org.glassfish.jersey.server.ExtendedUriInfo;

@Provider
public class JacksonV2Provider extends com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider {
  @Context
  private ExtendedUriInfo uriInfo;

  @Override
  public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
    return uriInfo.getPath().contains("/v2/");
  }

  @Override
  public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
    return uriInfo.getPath().contains("/v2/");
  }
}
