/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;


public class Corporate {

    private HumanResources hr;
    public Corporate()
    {
        hr = new HumanResources();
    }
    public void hireEmployee(String fName, String lName, String ssn)
    {
        hr.hireEmployee(fName, lName, ssn);
        hr.runEmployeeReport(ssn);
    }

    public HumanResources getHr() {
        return hr;
    }

    public void setHr(HumanResources hr) {
        this.hr = hr;
    }
    
    
}
