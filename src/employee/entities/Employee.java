package employee.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage){
        grossSalary += grossSalary * (percentage / 100);
    }

    @Override
    public String toString() {
        return String.format("Funcionário: %s, R$ %.2f", name, netSalary());
    }
}
