import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IncreasingTripletSubsequenceTest {
    IncreasingTripletSubsequence sut = new IncreasingTripletSubsequence();

    @Test
    void test(){
        boolean b = sut.increasingTriplet(new int[]{1, 2, 3, 4, 5});
        Assertions.assertEquals(b, true);
    }
    @Test
    void test1(){
        boolean b = sut.increasingTriplet(new int[]{5,4,3,2,1});
        Assertions.assertEquals(b, false);
    }
    @Test
    void test2(){
        boolean b = sut.increasingTriplet(new int[]{2,1,5,0,4,6});
        Assertions.assertEquals(b, true);
    }
}