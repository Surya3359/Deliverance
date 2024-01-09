package ComparatorEX;

import java.util.Comparator;

class Employee{
    private int id;
    private String name;
    private int salary;
    
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public String toString() {
    	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getSalary(), e2.getSalary());
    }
}


