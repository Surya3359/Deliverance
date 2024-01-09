package ComparableProgram;
import java.util.ArrayList;
import java.util.Collections;


public interface CollectionInterface{
		
		    public static void main(String[] args) {
		        ArrayList<Employee> employees = new ArrayList<>();
		        employees.add(new Employee(1, "John", 50000));
		        employees.add(new Employee(2, "Jane", 60000));
		        employees.add(new Employee(3, "Bob", 40000));
		        
		        Collections.sort(employees);
		        
		        for (Employee employee : employees) {
		            System.out.println(employee);
		        }
		    }
}

