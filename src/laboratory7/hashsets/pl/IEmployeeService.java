package laboratory7.hashsets.pl;


import java.util.Collection;
import java.util.List;

import laboratory4.Ex2.com.cg.eis.bean.Employee;

public interface IEmployeeService {

	public boolean insertEmployee(Employee e);
	public Collection<Employee> getAllEmployees();
	public Collection<Employee> getAllEmployeesBySalary(int range1,int range2);
	public Employee getEmployeeById(int id);
	public List<Employee> deleteEmployee(int id);
	public Collection<Employee> getAllEmployeeInsuranceScheme();
}