class Employee {
	String name, address, job_title;
	int salary;
	double bonus_factor = 1;
	double bonus = 0;

	Employee(String name, String address, int salary) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.job_title = "Employee";
	}

	void calculateBonus() {
		bonus = (salary * bonus_factor);
	}

	void display() {
		calculateBonus();
		System.out.println("Name      : " + name);
		System.out.println("Job Title : " + job_title);
		System.out.println("Address   : " + address);
		System.out.println("Salary    : " + salary + "/=");
		System.out.println("Bonus     : " + (int)bonus + "/=");
		System.out.println("");
	}
}

class Manager extends Employee {
	

	Manager(String name, String address, int salary) {
		super(name, address, salary);
		job_title = "Manager";
		bonus_factor = 0.3;
	}

	void manageProjects() {
		System.out.println("Managing Projects");
	}
}

class Developer extends Employee {
	
	Developer(String name, String address, int salary) {
		super(name, address, salary);
		job_title = "Developer";
		bonus_factor = 0.2;
	}

	void generateReports() {
		System.out.println("Generating performance reports");
	}
}

class Programmer extends Employee {
	
	Programmer(String name, String address, int salary) {
		super(name, address, salary);
		job_title = "Programmer";
		bonus_factor = 0.1;
	}

	void buildProgram() {
		System.out.println("Building programs");
	}
}

public class EmployeeClass {
	public static void main(String[] args) {
		Manager m = new Manager("Shahriar", "Rupnagar", 65000);
		Developer d = new Developer("Zehan", "Kushtia", 35000);
		Programmer p = new Programmer("Simon", "Panchagar", 30000);
		m.display();
		d.display();
		p.display();
	}
}
