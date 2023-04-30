import org.example.LongestRepeatingCharacterReplacement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestRepeatingCharacterReplacementTest {
    LongestRepeatingCharacterReplacement sut = new LongestRepeatingCharacterReplacement();

    @Test
    void test() {
        int abab = sut.characterReplacementOptimize2("ABAB", 2);
        Assertions.assertEquals(4, abab);
    }

    //AABABBA
    @Test
    void test4() {
        int abab = sut.characterReplacementOptimize2("AABABBA", 1);
        Assertions.assertEquals(4, abab);
    }

    @Test
    void test1() {


        int aababba = sut.characterReplacementOptimize2("AABABBA", 4);

        Assertions.assertEquals(7, aababba);
    }

    @Test
    void test2() {
        int aababbabbbba = sut.characterReplacementOptimize2("AABABBABBBBA", 4);
        Assertions.assertEquals(1, 1);
    }

    @Test
    void test3() {
        int abbbba = sut.characterReplacementOptimize2("ABBBBA", 2);

        Assertions.assertEquals(6, abbbba);
    }
}