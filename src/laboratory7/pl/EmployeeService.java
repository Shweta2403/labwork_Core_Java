package laboratory7.pl;

import java.util.List;

import laboratory4.Ex2.com.cg.eis.bean.Employee;


public interface EmployeeService {
	
	public boolean insertEmployee(Employee e);
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesbyInsurance(String insurance);
	public List<Employee> getEmployeeById(int id, String name);

}