import java.util.ArrayList;
import java.util.HashMap;

public class PhoneRec {
    String name;
    String phoneNumber;

    HashMap<String, String> pr = new HashMap<>();

    public void add(String name, String phoneNumber) {
        pr.put(name, phoneNumber);
    }

    public void get(String name) {
        for(int i =0; i<pr.size();i++) {
            System.out.println(pr.get(name));
        }
    }
}
class Search {

        public static void main(String[] args) {
            PhoneRec p1 = new PhoneRec();
            p1.add("Ivanov", "8754512310");
            p1.get("Ivanov");

        }
    }
