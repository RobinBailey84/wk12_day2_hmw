package Staff;

public abstract class Employee {

    private String name;
    private String NInumber;
    private double salary;

    public Employee(String name, String NInumber, double salary) {
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNInumber() {
        return this.NInumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double increase){
        if(increase > 0) {
            this.salary = this.salary * increase;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }
}
