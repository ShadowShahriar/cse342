class Person {
    String firstName, lastName;
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName(){
        return firstName;
    }

    String getLastName(){
        return lastName;
    }
}

class Employee extends Person {
    int empID;
    String jobTitle;

    Employee(String firstName, String lastName, int empID, String jobTitle) {
        super(firstName,lastName);
        this.empID = empID;
        this.jobTitle = jobTitle;
    }

    int getEmployeeID(){
        return empID;
    }

    String getJobTitle(){
        return jobTitle;
    }
}

public class PersonClass {
    public static void main(String[] args) {
        Employee emp = new Employee("Shayan", "Shahriar", 408, "Software Engineer");
        System.out.println(emp.getFirstName());
        System.out.println(emp.getLastName());
        System.out.println(emp.getEmployeeID());
        System.out.println(emp.getJobTitle());
    }
}
