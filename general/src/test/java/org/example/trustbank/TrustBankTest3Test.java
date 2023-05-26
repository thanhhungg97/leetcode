package org.example.trustbank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrustBankTest3Test {
    TrustBankTest3 sut = new TrustBankTest3();


    @Test
    void test() {
        long maximumProfit = TrustBankTest3.getMaximumProfit(List.of(1, 5, 3, 4, 6), List.of(2, 3, 4, 5, 6));

        Assertions.assertEquals(15, maximumProfit);
    }

    @Test
    void test1() {
        long maximumProfit = TrustBankTest3.getMaximumProfit(List.of(2, 3, 1, 5, 9), List.of(1, 2, 6, 1, 5));

        Assertions.assertEquals(12, maximumProfit);
    }


}