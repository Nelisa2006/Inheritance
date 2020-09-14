package Models;

import Models.Employee;

public class Distributor extends Employee {
    String [] department;
    Boolean linkedProfiles;
    String address;
    String businessArea;

    public String[] getDepartment() {
        return department;
    }

    public void setDepartment(String[] department) {
        this.department = department;
    }

    public Boolean getLinkedProfiles() {
        return linkedProfiles;
    }

    public void setLinkedProfiles(Boolean linkedProfiles) {
        this.linkedProfiles = linkedProfiles;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea;
    }
}
