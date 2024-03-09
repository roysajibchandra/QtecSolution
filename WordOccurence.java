import java.util.*;

public class WordOccurence {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    // String line = input.nextLine().toString();
    String line = input.nextLine().toLowerCase();

    // TreeMap is declared to store words by tree order

    Map<String, Integer> map = new TreeMap<>();

    // this looping for ignore punctuation marks, whitespace, and case sensitivity
    // appropriately the sentence.

    for (String word : line.split("[\\W|\\s]+")) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    // this looping for count the unique word for the sentence
    for (Map.Entry entry : map.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    input.close();
  }
}
