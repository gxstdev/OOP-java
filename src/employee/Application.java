package employee;

import employee.entities.Employee;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Nome:");
        employee.name = input.nextLine();
        System.out.print("Salário Bruto: ");
        employee.grossSalary = input.nextDouble();
        System.out.print("Imposto: ");
        employee.tax = input.nextDouble();

        System.out.println(employee);

        System.out.print("Qual a porcentagem para aumentar o salário? ");
        employee.increaseSalary(input.nextDouble());
        System.out.println("Dados atualizados: \n" + employee);

        input.close();
    }
}
