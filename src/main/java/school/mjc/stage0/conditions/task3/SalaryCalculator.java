package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            double taxes = salary * 0.15;
            double netSalary = salary - taxes;
            System.out.println(netSalary);
        } else if (salary <= 20000) {
            double taxes = salary * 0.18;
            double netSalary = salary - taxes;
            System.out.println(netSalary);
        } else {
            double taxes = salary * 0.20;
            double netSalary = salary - taxes;
            System.out.println(netSalary);
        }
    }
}
