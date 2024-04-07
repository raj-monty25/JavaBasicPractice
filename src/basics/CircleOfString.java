import java.util.*;

public class CircleOfString {
    public static int doesCircleExist(String[] strings, int size) {
        // Build adjacency list representing the graph
        Map<Character, List<String>> adjacencyList = new HashMap<>();
        for (String str : strings) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            adjacencyList.putIfAbsent(firstChar, new ArrayList<>());
            adjacencyList.putIfAbsent(lastChar, new ArrayList<>());
            adjacencyList.get(firstChar).add(str);
        }

        // Perform depth-first search to check for cycles
        Set<String> visited = new HashSet<>();
        for (String str : strings) {
            if (!visited.contains(str) && hasCycle(str, str.charAt(str.length() - 1), adjacencyList, visited)) {
                return 1; // Circle of strings exists
            }
        }

        return 0; // Circle of strings does not exist
    }

    private static boolean hasCycle(String currentString, char lastChar, Map<Character, List<String>> adjacencyList, Set<String> visited) {
        visited.add(currentString);
        char firstChar = currentString.charAt(0);

        if (firstChar == lastChar) {
            return true; // Cycle found
        }

        List<String> nextStrings = adjacencyList.getOrDefault(lastChar, new ArrayList<>());
        for (String str : nextStrings) {
            if (!visited.contains(str) && hasCycle(str, str.charAt(str.length() - 1), adjacencyList, visited)) {
                return true; // Cycle found
            }
        }

        visited.remove(currentString);
        return false; // No cycle found
    }

    public static void main(String[] args) {
        // Example usage
        String[] strings = {"abc", "def", "ghi", "ifa"};
        int size = strings.length;
        int result = doesCircleExist(strings, size);
        System.out.println(result); // Output: 1
    }
}
