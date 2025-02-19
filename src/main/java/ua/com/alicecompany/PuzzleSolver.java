package ua.com.alicecompany;

import java.util.List;

public class PuzzleSolver {
    public static void main(String[] args) {
        String filePath = "PortaOne.txt"; // For running in IDEA
        List<String> numbers = FileReaderUtil.readNumbersFromFile(filePath);

        if (numbers.isEmpty()) {
            System.err.println("No valid numbers found in the file.");
            System.exit(1);
        }

        String longestSequence = NumberChainBuilder.buildLongestSequence(numbers);
        System.out.println("Longest sequence: " + longestSequence);
    }
}