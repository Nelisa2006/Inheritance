package Services;


import Models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private Employee employee;
    private String sessionKey;

    List<Employee> employeeList = new ArrayList<>();


    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public List<Employee> getEmployees(){

        return employeeList;
    }

    public EmployeeService (){
        employee = new Employee("Nelisa", "nelisa.sahula@gmail.com", 24, 30.000, 8.5 );
        sessionKey = "9796";
    }
}
