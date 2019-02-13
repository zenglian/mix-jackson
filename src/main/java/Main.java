import java.net.URI;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import v1.JacksonV1Provider;
import v1.Service1;
import v2.JacksonV2Provider;
import v2.Service2;

public class Main {
  public static void main(final String[] args) {
    ResourceConfig config = new ResourceConfig();
    config.register(Service1.class)
        .register(Service2.class)
        .register(JacksonV1Provider.class)
        .register(JacksonV2Provider.class);
    GrizzlyHttpServerFactory.createHttpServer(URI.create("http://0.0.0.0:8123"), config);
  }
}
