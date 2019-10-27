import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonFromUrl {
    public static void main(String[] args) {
        final String jsonUrl = "https://spreadsheets.google.com/feeds/list/1lS00JNIagjJC_dCE-Ao_YmAxn3IWfu-IcNctQUeZcRU/od6/public/values?alt=json";
        try {
            ObjectMapper mapper = new ObjectMapper();
            URL url = new URL(jsonUrl);
            try { FinanceSheet financeSheet = mapper.readValue(url, FinanceSheet.class);
                System.out.println(financeSheet);
                System.out.println(financeSheet.getLastUpdated());
                for(FinanceSheet.Feed.Entry entry: financeSheet.getEntries()) {
                    System.out.println(" Name: " + entry.name.$t + " contact " + entry.contact.$t);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

//try {
//        URL url = new URL(jsonUrl);
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//        Feed feed = mapper.readValue(url, Feed.class);
//        System.out.println(feed);
//        } catch (Exception e) {
//        e.printStackTrace();
//        }
//        } catch (MalformedURLException e) {
//        e.printStackTrace();
//        }

//    File jsonFile = new File("src/SpreadsheetSample.json");
//                InputStream inputStream = this.getClass().getResource("SpreadsheetSample.json")

//
