package Management;

import Staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, String NInumber, double salary, double budget) {
        super(name, NInumber, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public double payBonus(){
        return getSalary() * 0.02;
    }
}
