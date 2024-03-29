/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sethu
 */
public class CreateAdminUser extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Restaurant restaurant;
    /**
     * Creates new form CreateAdminUser
     */
    public CreateAdminUser(JPanel userProcessContainer,EcoSystem ecosystem, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.restaurant = restaurant;
        
        populateInfo(restaurant);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCompany = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        lblRole = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCompany.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCompany.setText("Company :");
        add(lblCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 191, 91, 35));

        txtRole.setEditable(false);
        add(txtRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 237, 179, 35));

        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRole.setText("Role :");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 237, 91, 35));

        btnSave.setForeground(new java.awt.Color(0, 51, 204));
        btnSave.setText("💾 Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 328, -1, -1));

        btnCancel.setForeground(new java.awt.Color(255, 0, 0));
        btnCancel.setText("❌ Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 328, -1, -1));

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(0, 102, 102));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("ADD NEW ADMIN");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 42));

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name : ");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 99, 91, 35));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 99, 179, 35));

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password : ");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 145, 91, 35));

        txtCompany.setEditable(false);
        add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 191, 179, 35));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 145, 179, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        goBack();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        // check for unique names as usernames
        
        String name = txtName.getText();
        String companyName = restaurant.getName();
        char[] passwordArray = txtPassword.getPassword();
        String password = String.valueOf(passwordArray); // reconstruct password
        Role role = new AdminRole();
        if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(name)) {
            Employee newEmployee = ecosystem.getEmployeeDirectory().createEmployee(name, companyName);
            UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(name, password, newEmployee, role);
            
            goBack();
        } else {
            JOptionPane.showMessageDialog(this, "User with same username already exists");
            return;
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRole;
    // End of variables declaration//GEN-END:variables

    private void goBack() {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    private void populateInfo(Restaurant restaurant) {
        txtCompany.setText(restaurant.getName());
        txtRole.setText("Restaurant Admin");
    }
}
