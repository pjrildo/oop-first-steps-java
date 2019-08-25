package list.ex;

public class Employee {
	
	private short id;
	private String name;
	private double salary;
	
	public Employee(short id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public short getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double percentage) {
		salary+= (percentage/100) * salary;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}
