abstract class Employee {
    double salary = 0;
    double salary_factor = 0;
    Employee(double salary) {
        this.salary = salary;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(double salary){
        super(salary);
        this.salary_factor = 1;
    }

    void calculateSalary(){
        System.out.println("Salary: " + (salary * salary_factor));
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(double salary){
        super(salary);
        this.salary_factor = 0.6;
    }

    void calculateSalary(){
        System.out.println("Salary: " + (salary * salary_factor));
    }
}

public class EmployeeClass {
    public static void main(String[] args) {
        Employee ftE = new FullTimeEmployee(20000);
        ftE.calculateSalary();

        Employee ptE = new PartTimeEmployee(20000);
        ptE.calculateSalary();
    }
}
