package org.example.trustbank;

import org.junit.jupiter.api.Test;

class EngineerFirmTest {
    EngineerFirm sut = new EngineerFirm(5);
    AccountantFirm accountantFirm = new AccountantFirm(5);

    @Test
    void test() {
        sut.assignSalaries(new int[]{6848, 9329, 9984, 5543, 7986});
        accountantFirm.assignSalaries(new int[]{9317, 7796, 3352, 7068, 9500});
        sut.averageSalary();
        accountantFirm.averageSalary();
        sut.maxSalary();
        accountantFirm.maxSalary();

        sut.minSalary();
        accountantFirm.minSalary();


    }

}