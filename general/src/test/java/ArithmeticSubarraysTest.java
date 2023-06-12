import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticSubarraysTest{
    ArithmeticSubarrays sut = new ArithmeticSubarrays();

    @Test
    void test(){
        List<Boolean> booleans = sut.checkArithmeticSubarrays(new int[]{4, 6, 5, 9, 3, 7}, new int[]{0, 0, 2}, new int[]{2, 3, 5});
        Assertions.assertEquals(List.of(true, false, true), booleans);
    }
    @Test
    void test1(){
        List<Boolean> booleans = sut.checkArithmeticSubarrays(new int[]{-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10}, new int[]{0,1,6,4,8,7}, new int[]{4,4,9,7,9,10});
        Assertions.assertEquals(List.of(false,true,false,false,true,true), booleans);
    }
}