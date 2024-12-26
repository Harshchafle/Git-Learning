
import java.util.*;

public class open {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String fruit : inputList) {
            frequencyMap.put(fruit, frequencyMap.getOrDefault(fruit, 0) + 1);
        }

        System.out.println("Frequency Map: " + frequencyMap);

        List<Map.Entry<String, Integer>> sortedFrequencyEntries = new ArrayList<>(frequencyMap.entrySet());
        sortedFrequencyEntries.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        System.out.println("Sorted Frequency Map: " + sortedFrequencyEntries);

        List<String> mostFrequentFruits = new ArrayList<>();
        int maxFrequency = sortedFrequencyEntries.get(0).getValue();

        for (Map.Entry<String, Integer> entry : sortedFrequencyEntries) {
            if (entry.getValue() == maxFrequency) {
                mostFrequentFruits.add(entry.getKey());
            } else {
                break;
            }
        }
    }
}