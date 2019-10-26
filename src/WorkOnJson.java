
import com.fasterxml.jackson.databind.ObjectMapper;

public class WorkOnJson {
    private static class Name {
        public String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static class Detail {
        public String name, age;
    }
    public static void main(String[] args) {
        String s = "{\"name\":\"Sandra\"}";
        String d = "{\"name\":\"Mahesh\", \"age\":21}";

        ObjectMapper mapper = new ObjectMapper();
        try {
            Name name =mapper.readValue(s, Name.class);
            Detail detail = mapper.readValue(d, Detail.class);

            System.out.println(name.name);
            System.out.println(detail.name + " AGE: " + detail.age);
            String fromJson = mapper.writeValueAsString(name);
            System.out.println(fromJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
