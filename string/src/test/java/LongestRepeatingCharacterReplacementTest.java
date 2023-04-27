import org.example.LongestRepeatingCharacterReplacement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestRepeatingCharacterReplacementTest {
    LongestRepeatingCharacterReplacement sut = new LongestRepeatingCharacterReplacement();

    @Test
    void test() {
        int abab = sut.characterReplacement("ABAB", 2);
        Assertions.assertEquals(4, abab);
    }
    @Test
    void test1() {
        sut.characterReplacement("AABABBA", 4);
    }
    @Test
    void test2() {
        sut.characterReplacement("AABABBABBBBA", 4);
    }
}