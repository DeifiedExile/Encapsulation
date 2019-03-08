/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;

import java.util.ArrayList;
import java.util.List;


public class HumanResources {

    private List<Employee> employees;
    
    
    public HumanResources()
    {
        employees = new ArrayList<Employee>();
        
    }
    public void hireEmployee(String fName, String lName, String ssn)
    {
        Employee employee = new Employee(fName, lName, ssn);
        orientNewHire(employee, "cube1");
        employees.add(employee);
    }
    public void orientNewHire(Employee e, String cubicleID)
    {
        e.doFirstTimeOrientation(cubicleID);
    }
    public List<Employee> getEmployees()
    {
        return employees;
    }
    public void setEmployees(List<Employee> employees)
    {
        this.employees = employees;
    }
    public void runEmployeeReport(String ssn)
    {
        Employee employee = null;
        for(Employee e : employees)
        {
            if(e.getSsn().equalsIgnoreCase(ssn))
            {
                employee = e;
            }
        }
        if(employee != null)
        {
            employee.getReportService().outputReport();
        }
        else
        {
            throw new IllegalArgumentException("No employee found.");
        }
    }
   
}
