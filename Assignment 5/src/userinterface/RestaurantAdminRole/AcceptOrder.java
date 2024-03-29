/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.MenuItem;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sethu
 */
public class AcceptOrder extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Restaurant restaurant;
    Order order;
    /**
     * Creates new form AcceptOrder
     */
    public AcceptOrder(JPanel userProcessContainer, EcoSystem ecosystem,Restaurant restaurant, Order order) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.restaurant = restaurant;
        this.order = order;
        
        populateOrder();
        PopulateMenu(ecosystem.getDeliveryManDirectory());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenuItem = new javax.swing.JLabel();
        lblDeliveryDate = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtComment = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        lblComment = new javax.swing.JLabel();
        inpCost = new javax.swing.JLabel();
        inpQuantity = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtRestaurant = new javax.swing.JTextField();
        txtMenuItem = new javax.swing.JTextField();
        btnAcceptOrder = new javax.swing.JButton();
        txtOrderDate = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        lblOrderDate = new javax.swing.JLabel();
        lblRestaurant = new javax.swing.JLabel();
        txtDeliveryDate = new javax.swing.JTextField();
        lblDeliveryMan = new javax.swing.JLabel();
        menuDeliveryMan = new javax.swing.JComboBox<>();

        lblMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMenuItem.setText("Menu Item :");

        lblDeliveryDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDeliveryDate.setText("Delivery Date :");

        txtStatus.setEditable(false);

        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("🔙 Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtComment.setEditable(false);

        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus.setText("Status : ");

        lblCost.setText("Cost ($) : ");

        lblComment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblComment.setText("Comment : ");

        inpCost.setText("<Cost>");

        inpQuantity.setText("<Quantity>");

        lblQuantity.setText("Quantity (lbs) : ");

        txtRestaurant.setEditable(false);

        txtMenuItem.setEditable(false);

        btnAcceptOrder.setForeground(new java.awt.Color(0, 102, 204));
        btnAcceptOrder.setText("✔ Assign & Accept");
        btnAcceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptOrderActionPerformed(evt);
            }
        });

        txtOrderDate.setEditable(false);

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(0, 102, 102));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("VIEW & ACCEPT ORDERS");

        lblOrderDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrderDate.setText("Order Date :");

        lblRestaurant.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRestaurant.setText("Restaurant :");

        txtDeliveryDate.setEditable(false);

        lblDeliveryMan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDeliveryMan.setText("Delivery By : ");

        menuDeliveryMan.setForeground(new java.awt.Color(153, 153, 0));
        menuDeliveryMan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        menuDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeliveryManActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAcceptOrder)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDeliveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDeliveryDate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtOrderDate))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCost, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inpCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inpQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMenuItem))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDeliveryMan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComment, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeliveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeliveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComment, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpCost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAcceptOrder)
                .addGap(240, 240, 240))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        goBack();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAcceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptOrderActionPerformed
        // TODO add your handling code here:
        String DeliveryManName = menuDeliveryMan.getSelectedItem().toString();
        Order myNewOrder = order;
        if (order.getStatus().equals("Cancelled") || order.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(this, "Cancelled or Completed order cannot be accepted");
            return;
        }
        myNewOrder.setDeliveryManName(DeliveryManName);
        myNewOrder.setStatus("In Progress");
        int index = -1;
        for (int i = 0; i < ecosystem.getOrderDirectory().getOrderDirectory().size(); i++) {
            Order tempOrder = ecosystem.getOrderDirectory().getOrderDirectory().get(i);
            Order tempOrder2 = order;
            if (tempOrder2.getCustomerName().equals(tempOrder.getCustomerName()) && tempOrder2.getOrderTime().equals(tempOrder.getOrderTime())) {
                index = i;
            }
        }
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Unable to assign delivery man");
            return;
        } else {
            ecosystem.getOrderDirectory().modifyOrder(index, myNewOrder); // add comment to order
            goBack();
        }
    }//GEN-LAST:event_btnAcceptOrderActionPerformed

    private void menuDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeliveryManActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDeliveryManActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptOrder;
    private javax.swing.JLabel inpCost;
    private javax.swing.JLabel inpQuantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblDeliveryDate;
    private javax.swing.JLabel lblDeliveryMan;
    private javax.swing.JLabel lblMenuItem;
    private javax.swing.JLabel lblOrderDate;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblRestaurant;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JComboBox<String> menuDeliveryMan;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtDeliveryDate;
    private javax.swing.JTextField txtMenuItem;
    private javax.swing.JTextField txtOrderDate;
    private javax.swing.JTextField txtRestaurant;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

    private void goBack() {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    private void populateOrder() {
        String RestaurantName = "N/A";
        String MenuItemName = "N/A";
        String orderDate = "N/A";
        String deliveryDate = "N/A";
        String Status = "N/A";
        String Cost = "N/A";
        String Quantity = "N/A";
        String comment = "";
        MenuItem myMenuItem = new MenuItem();
        Restaurant myRestaurant = new Restaurant();
        if (order.getRestaurantName() != null) {
            RestaurantName = order.getRestaurantName();
        }
        if (order.getOrderList().size() == 1) {
            myRestaurant = ecosystem.getRestaurantDirectory().findRestaurant(RestaurantName);
            if (myRestaurant != null) {
                MenuItemName = order.getOrderList().get(0);
                myMenuItem = myRestaurant.findMenuItem(MenuItemName);
                if (myMenuItem != null) {
                 Cost = String.valueOf(myMenuItem.getCost());
                 Quantity = String.valueOf(myMenuItem.getQuantity());   
                }
            }
        }
        if (order.getOrderTime() != null) {
            orderDate = order.getOrderTime().toString();
        }
        if (order.getDeliveryTime() != null) {
            deliveryDate = order.getDeliveryTime().toString();
        }
        if (order.getStatus() != null){
            Status = order.getStatus();
        }
        if (order.getComment() != null) {
            comment = order.getComment();
        }
        
        txtRestaurant.setText(RestaurantName);
        txtMenuItem.setText(MenuItemName);
        txtOrderDate.setText(orderDate);
        txtDeliveryDate.setText(deliveryDate);
        inpCost.setText(Cost);
        inpQuantity.setText(Quantity);
        txtComment.setText(comment);
        txtStatus.setText(Status);
    }

    private void PopulateMenu(DeliveryManDirectory deliveryManDirectory) {
        ArrayList<String> DelveryMenList = new ArrayList<String>();
        DelveryMenList.add("");
        for(DeliveryMan r: deliveryManDirectory.getDeliveryManDirectory()){
            DelveryMenList.add(r.getName());
        }
        String[] myMenu = DelveryMenList.toArray(new String[0]);
        menuDeliveryMan.setModel(new javax.swing.DefaultComboBoxModel<>(myMenu));
    }
}
