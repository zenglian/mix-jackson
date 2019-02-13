package v1;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;

@Data
class Model1 {
  @JsonProperty("v1.name")
  private String name = "Jackson1";
}
