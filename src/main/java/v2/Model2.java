package v2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
class Model2 {
  @JsonProperty("v2.name")
  private String name = "Jackson2";
}
