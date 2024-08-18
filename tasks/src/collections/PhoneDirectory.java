package collections;

import java.util.*;

public class PhoneDirectory {
    private Map<String, List<String>> phoneDirectory;

    public PhoneDirectory () {
        phoneDirectory = new HashMap<>();
    }

    public void add(String lastName, String phone) {
        if (!phoneDirectory.containsKey(lastName)) {
            phoneDirectory.put(lastName, new ArrayList<>());
        }
        phoneDirectory.get(lastName).add(phone);
    }

    public List<String> getInfo (String lastName) {
        return phoneDirectory.getOrDefault(lastName, Collections.emptyList());
    }
}
