package pl.yellowduck.netflix90;

import com.fasterxml.v.core.JsonProcessingException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExampleTest {

  @Test
  public void shouldExecuteExampleTest() throws JsonProcessingException {
    // given
    String str = "Hello";
    String brand = "Netflix90";

    // when
    String result = str + " " + brand;

    // then
    assertThat(result).isEqualTo("Hello Netflix90");
  }
}
