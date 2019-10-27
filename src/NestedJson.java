import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class NestedJson {

    public static class Person implements Serializable {
        @JsonProperty("names")
        List<Names> names;
        public String age;
    }

    public static class Names {
        public String firstName, lastName;
    }
    public static void main(String[] args) {
        String pJson = "{\"names\":[{\"firstName\":\"Junior\",\"lastName\":\"Celeb\"}, {\"firstName\":\"Queen\",\"lastName\":\"Beeta\"}],\"age\":\"21\"}";

        ObjectMapper mapper = new ObjectMapper();
        try {
            Person p = mapper.readValue(pJson, Person.class);
            System.out.println(p.names.get(1).firstName);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

