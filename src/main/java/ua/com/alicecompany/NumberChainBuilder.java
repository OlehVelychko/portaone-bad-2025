package ua.com.alicecompany;
import java.util.ArrayList;
import java.util.List;

public class NumberChainBuilder {

    public static String buildLongestSequence(List<String> numbers) {
        String bestSequence = "";

        for (String startNum : numbers) {
            List<String> remaining = new ArrayList<>(numbers);
            remaining.remove(startNum);
            String sequence = buildSequence(startNum, remaining);

            if (sequence.length() > bestSequence.length()) {
                bestSequence = sequence;
            }
        }
        return bestSequence;
    }

    private static String buildSequence(String current, List<String> remaining) {
        String bestPath = current;
        boolean foundNext = true;

        while (foundNext) {
            foundNext = false;
            String suffix = current.substring(current.length() - 2);
            String bestNext = "";
            int bestNextIndex = -1;

            for (int i = 0; i < remaining.size(); i++) {
                String next = remaining.get(i);
                if (next.startsWith(suffix)) {
                    if (bestNext.isEmpty() || next.length() > bestNext.length()) {
                        bestNext = next;
                        bestNextIndex = i;
                    }
                }
            }

            if (!bestNext.isEmpty()) {
                foundNext = true;
                remaining.remove(bestNextIndex);
                current += bestNext.substring(2);
                bestPath = current;
            }
        }

        return bestPath;
    }
}