package Homework5;
import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();


        phoneBook.put("Иванов", Arrays.asList("123456789", "987654321"));
        phoneBook.put("Петров", Arrays.asList("111222333"));
        phoneBook.put("Сидоров", Arrays.asList("444555666", "777888999"));
        phoneBook.put("Смирнов", Arrays.asList("555555555"));


        HashMap<String, Integer> phoneCount = new HashMap<>();
        for (String name : phoneBook.keySet()) {
            int count = phoneBook.get(name).size();
            phoneCount.put(name, count);
        }


        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(phoneCount.entrySet());
        Collections.sort(sortedEntries, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));


        for (Map.Entry<String, Integer> entry : sortedEntries) {
            String name = entry.getKey();
            int count = entry.getValue();
            System.out.println(name + ": " + count + " телефон(а/ов)");
        }
    }
}
