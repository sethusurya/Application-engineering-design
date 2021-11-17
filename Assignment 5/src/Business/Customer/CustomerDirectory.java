/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {

    private ArrayList<Customer> customerDirectory;
    
    public CustomerDirectory(){
        customerDirectory = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    
    public ArrayList<Customer> addCustomer(Customer newCustomer) {
        customerDirectory.add(newCustomer);
        return customerDirectory;
    }

    public void removeCustomer(Customer selectedCustomer) {
        customerDirectory.remove(selectedCustomer);
    }
    
}
