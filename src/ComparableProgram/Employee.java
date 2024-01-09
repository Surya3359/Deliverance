package ComparableProgram;

class Employee implements Comparable<Employee> {
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
    
    public int compareTo(Employee bro) {
        return Integer.compare(this.salary, bro.salary);
    }
    
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

