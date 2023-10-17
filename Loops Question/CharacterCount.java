import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> charCountMap = countCharacters(input);

        System.out.println("Character counts in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " times");
        }
    }

    public static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c); // Ignore case
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        return charCountMap;
    }
}
