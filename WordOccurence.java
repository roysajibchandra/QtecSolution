import java.util.*;

public class WordOccurence {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    // String line = input.nextLine().toString();
    String line = input.nextLine().toLowerCase();

    Map<String, Integer> map = new TreeMap<>();
    for (String word : line.split("[\\W|\\s]+")) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    for (Map.Entry entry : map.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    input.close();
  }
}
