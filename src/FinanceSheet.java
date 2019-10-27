import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FinanceSheet implements Serializable {
    @JsonProperty("feed")
    Feed feed;

    String getLastUpdated() {
        return feed.updated.$t;
    }

    List<Feed.Entry> getEntries() {
        return feed.entries;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Feed implements Serializable {
        @JsonProperty("updated")
        Updated updated;

        @JsonIgnoreProperties(ignoreUnknown = true)
        static class Updated implements Serializable {
            @JsonProperty("$t")
            String $t;
        }

        @JsonProperty("entry")
        List<Entry> entries;

        @JsonIgnoreProperties(ignoreUnknown = true)
        static class Entry implements Serializable {
            @JsonProperty("gsx$name")
            Name name;

            static class Name implements Serializable {
                @JsonProperty("$t")
                String $t;
            }

            @JsonProperty("gsx$duty")
            Duty duty;

            static class Duty implements Serializable {
                @JsonProperty("$t")
                String $t;
            }

            @JsonProperty("gsx$room")
            Room room;

            static class Room implements Serializable {
                @JsonProperty("$t")
                String $t;
            }

            @JsonProperty("gsx$contact")
            Contact contact;

            static class Contact implements Serializable {
                @JsonProperty("$t")
                String $t;
            }

            @JsonProperty("gsx$picture")
            Picture picture;

            static class Picture implements Serializable {
                @JsonProperty("$t")
                String $t;
            }
        }
    }
}


