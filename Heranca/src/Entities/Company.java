package Entities;

public class Company extends Payer{

    private int numberOfEmployees;

    public Company(String name, Double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double basicTax;
        if (getNumberOfEmployees() > 10) {
            basicTax = getAnnualIncome() * 0.14;
        } else {
            basicTax = getAnnualIncome() * 0.16;
        }
        return basicTax;
    }
}
