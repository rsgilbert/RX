
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Feed implements Serializable {
    public Updated updated;
    public List<Entry> entry;

//    public String getFinance() {
//        return entry.ge
//    }
    public String getLastUpdated() {
        return updated.$t;
    }

    public class Updated {
        public String $t;
    }


    public class Entry {
        public Gsx$name gsx$name;
        public Gsx$duty gsx$duty;
        public Gsx$room gsx$room;
        public Gsx$contact gsx$contact;
        public Gsx$picture gsx$picture;


        public class Gsx$name {
            public String $t;
        }
        public class Gsx$duty {
            public String $t;
        }
        public class Gsx$room {
            public String $t;
        }
        public class Gsx$contact {
            public String $t;
        }
        public class Gsx$picture {
            public String $t;
        }


        public Gsx$name getGsx$name() {
            return gsx$name;
        }

        public void setGsx$name(Gsx$name gsx$name) {
            this.gsx$name = gsx$name;
        }

        public Gsx$duty getGsx$duty() {
            return gsx$duty;
        }

        public void setGsx$duty(Gsx$duty gsx$duty) {
            this.gsx$duty = gsx$duty;
        }

        public Gsx$room getGsx$room() {
            return gsx$room;
        }

        public void setGsx$room(Gsx$room gsx$room) {
            this.gsx$room = gsx$room;
        }

        public Gsx$contact getGsx$contact() {
            return gsx$contact;
        }

        public void setGsx$contact(Gsx$contact gsx$contact) {
            this.gsx$contact = gsx$contact;
        }

        public void setGsx$picture(Gsx$picture gsx$picture) {
            this.gsx$picture = gsx$picture;
        }

        public Gsx$picture getGsx$picture() {
            return gsx$picture;
        }
    }

}

