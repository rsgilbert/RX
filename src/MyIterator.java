import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

public class MyIterator {
    public static void main (String[] args) {
        List<String> contacts = new ArrayList<>();
        contacts.add("Donkey");
        contacts.add("Hippo");
        contacts.add("Jackie Chan");
        for(String contact: contacts) {
            System.out.println(contact);
        }
        System.out.println("**********");
        for(Iterator<String> iterator = contacts.iterator(); iterator.hasNext();) {
            String contact = iterator.next();
            System.out.println(contact);
        }


    }
}
