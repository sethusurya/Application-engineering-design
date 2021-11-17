/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, String companyName ){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setCompanyName(companyName);
        employeeList.add(employee);
        return employee;
    }
    

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public ArrayList<Employee> removeEmployee(Employee newEmployee) {
       employeeList.remove(newEmployee);
       return employeeList;
    }

}