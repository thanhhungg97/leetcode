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


        int aababba = sut.characterReplacement("AABABBA", 4);

        Assertions.assertEquals(4, aababba);
    }

    @Test
    void test2() {
        int aababbabbbba = sut.characterReplacement("AABABBABBBBA", 4);
        Assertions.assertEquals(1,1);
    }

    @Test
    void test3() {
        int abbbba = sut.characterReplacement("ABBBBA", 2);

        Assertions.assertEquals(6, abbbba);
    }
}