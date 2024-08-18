package collections;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Part 1 create array of words and print unique
        List<String> words = Arrays.asList("banana", "banana", "grape", "grape", "kiwi", "kiwi", "apple", "apple", "blackberry", "blackberry", "blackcurrant", "blackcurrant");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
        Map<String, Integer> counterOfWord = new HashMap<>();
        for (String x : words) {
            int newValue = counterOfWord.getOrDefault(x, 0) + 1;
            counterOfWord.put(x, newValue);
        }
        System.out.println(counterOfWord);

        //Part 2 create telephone directory
        PhoneDirectory phone = new PhoneDirectory();
        phone.add("Smith", "21963152");
        phone.add("Smith", "23457879");
        phone.add("Vrio", "99999999");
        phone.add("GIO", "88888888");
        phone.add("Blacker", "77777777");
        phone.add("Antonio", "33333333");
        phone.add("Smith", "22222222");
        List<String> smithPhones = phone.getInfo("Smith");
        System.out.println(smithPhones);
    }
}
