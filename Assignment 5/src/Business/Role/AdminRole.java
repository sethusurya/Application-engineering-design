/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        Restaurant restaurant = new Restaurant();
        for (Restaurant r: business.getRestaurantDirectory().getRestaurantDirectory()) {
            if (account.getEmployee().getCompanyName().equals(r.getName())) {
                restaurant = r;
            }
        }
        return new AdminWorkAreaJPanel(userProcessContainer, business, restaurant);
    }

    
    
}
