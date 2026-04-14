import java.util.*;

class Employee implements Comparable<Employee>{
    int e_id;

    Employee(int e_id){
        this.e_id = e_id;
    }

    @Override
    public int compareTo(Employee e) {
        return this.e_id - e.e_id; // -1, 0, 1
    }

    public String toString(){
        return "id: " + this.e_id;
    }
}

public class EmployeeClass {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(199));
        employees.add(new Employee(122));
        employees.add(new Employee(231));
        employees.add(new Employee(35));
        employees.add(new Employee(408));
        employees.add(new Employee(109));
        employees.add(new Employee(9));
        employees.add(new Employee(10));
        employees.add(new Employee(13));
        employees.add(new Employee(1));

        Collections.sort(employees);
        System.out.println(employees);
    }
}
