package ua.com.alicecompany;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberChainBuilderTest {

    @Test
    void testSmallDataset() {
        List<String> numbers = List.of("608017", "248460", "962282", "994725", "177092");
        String result = NumberChainBuilder.buildLongestSequence(numbers);
        assertEquals("24846080177092", result);
    }

    @Test
    void testLargeDataset() {
        List<String> numbers = List.of(
                "942517", "605676", "498291", "668826", "357057", "478151",
                "315629", "007148", "252887", "421662", "284505", "467650",
                "115330", "648206", "207562", "612298", "576885", "294200"
        );
        String result = NumberChainBuilder.buildLongestSequence(numbers);

        // Ensure the sequence length is greater than 20 characters
        assertEquals(true, result.length() > 20, "Result sequence is too short");
    }
}