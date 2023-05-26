package org.example.trustbank;

public class TrustBankTest1 {
}


interface Company {
    void assignSalaries(int[] salaries);

    void averageSalary();

    void maxSalary();

    void minSalary();
}

enum FirmType {
    ENGINEER("engineers"),
    ACCOUNTANT("accountants");

    FirmType(String desc) {
        this.description = desc;
    }

    private String description;

    public String getDescription() {
        return description;
    }
}

class Firm implements Company {

    private int[] income;
    private double averageSalary = 0;
    private int maxSalary = 0;
    private int minSalary = 0;

    FirmType firmType;

    Firm(int n, FirmType firmType) {
        this.income = new int[n];
        this.firmType = firmType;

    }

    @Override
    public void assignSalaries(int[] salaries) {
        int total = 0;
        minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < income.length; i++) {
            income[i] = salaries[i];
            total += income[i];
            maxSalary = Math.max(maxSalary, income[i]);
            minSalary = Math.min(minSalary, income[i]);

        }
        averageSalary = (double) total / income.length;
        System.out.printf("Incomes of %s credited%n", firmType.getDescription());
    }

    @Override
    public void averageSalary() {
        System.out.printf("Average salary of %s is %.2f%n", firmType.getDescription(), averageSalary);
    }

    @Override
    public void maxSalary() {
        System.out.printf("Maximum salary amongst %s is %d%n", firmType.getDescription(), maxSalary);

    }

    @Override
    public void minSalary() {
        System.out.printf("Minimum salary amongst %s is %d%n", firmType.getDescription(), minSalary);
    }
}

class EngineerFirm extends Firm {

    EngineerFirm(int n) {
        super(n, FirmType.ENGINEER);
    }
}

class AccountantFirm extends Firm {

    AccountantFirm(int n) {
        super(n, FirmType.ACCOUNTANT);
    }
}