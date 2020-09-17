package Services;


import Models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private Employee employee;
    private String sessionKey;

    List<Employee> employeeList = new ArrayList<>();


    public void addEmployee(Employee employee){
        Boolean found;
        found = false;

        //for loop to loop through list of employees
        for(int x=0; x<=employeeList.size(); x++){
            if(employee.getEmail() == employeeList.get(x).getEmail()){
                found = true;
                break;
            }
        }
        if(found == false)
            employeeList.add(employee);
        else
            System.out.println("email address already exist");
    }

    public List<Employee> getEmployees(){

        return employeeList;
    }

    public EmployeeService (){
        employee = new Employee("Nelisa", "nelisa.sahula@gmail.com", 24, 30.000, 8.5 );
        sessionKey = "9796";
    }
}
