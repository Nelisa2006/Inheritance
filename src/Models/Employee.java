package Models;

public class Employee {
    String fullnames;
    String email;
    int age;
    Double salary;
    Double numberOfHoursWorked;

    //Default Constructor
    public Employee (){}

    //Overloaded Constructor
    public Employee (String fullnames, String email, int age, Double salary, Double numberOfHoursWorked){
        fullnames = fullnames;
        email = email;
        age = age;
        salary = salary;
        numberOfHoursWorked = numberOfHoursWorked;

    }

    public String getFullnames(){
        return fullnames;
    }

    public void setFullnames (String fullnames) {
        this.fullnames = fullnames;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Double getSalary() {
            return salary;
        }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getNumberOfHoursWorked(){
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(Double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
}



