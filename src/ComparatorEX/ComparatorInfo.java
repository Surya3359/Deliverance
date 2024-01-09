package ComparatorEX;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public interface ComparatorInfo {
	
	    public static void main(String[] args) {
	        ArrayList<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(1, "Mani", 500));
	        employees.add(new Employee(2, "Gowtham", 600));
	        employees.add(new Employee(3, "Vicky", 400));
	        employees.add(new Employee(4,"Surya",800));
	        
	        Comparator<Employee> salaryComparator = new SalaryComparator();
	        Collections.sort(employees, salaryComparator);
	        
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }
	    }
	}


