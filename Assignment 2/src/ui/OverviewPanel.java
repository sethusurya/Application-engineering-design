/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.Carlist;

/**
 *
 * @author sethu
 */
public class OverviewPanel extends javax.swing.JPanel {

    Carlist myCarList;
    private JPanel rightPanel;
    /**
     * Creates new form ViewPanel
     */
    public OverviewPanel(JPanel myJPanel,Carlist myCarList) {
        initComponents();
        this.myCarList = myCarList;
        
        rightPanel = myJPanel;
        
        populateTable(myCarList);
        populateMenu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        selCompany = new javax.swing.JComboBox<>();
        lblCompanyFtr = new javax.swing.JLabel();
        lblModelNumberFtr = new javax.swing.JLabel();
        lblModelNameFtr = new javax.swing.JLabel();
        selModelName = new javax.swing.JComboBox<>();
        selSeats = new javax.swing.JComboBox<>();
        lblSeatsFtr = new javax.swing.JLabel();
        btnApplyFtr = new javax.swing.JButton();
        btnClearFtr = new javax.swing.JButton();
        selCity = new javax.swing.JComboBox<>();
        lblCityFtr = new javax.swing.JLabel();
        selAvailability = new javax.swing.JComboBox<>();
        lblAvailabilityFtr = new javax.swing.JLabel();
        selMaintenanceCertificate = new javax.swing.JComboBox<>();
        lblMaintainenceFtr = new javax.swing.JLabel();
        lblManufacturingYearFtr = new javax.swing.JLabel();
        txtManufacturingYear = new javax.swing.JTextField();
        lblTotalCars = new javax.swing.JLabel();
        txtTotalCars = new javax.swing.JTextField();
        title1 = new javax.swing.JLabel();
        txtLastUpdate = new javax.swing.JTextField();
        lblLastUpdate = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("FILTERS");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 250, 30));

        txtModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNumberActionPerformed(evt);
            }
        });
        add(txtModelNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 166, 44));

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Company", "Name", "Seats", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPane.setViewportView(viewTable);

        add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 680, 312));

        btnEdit.setText("View / Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 750, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 750, -1, -1));

        selCompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selCompanyActionPerformed(evt);
            }
        });
        add(selCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 156, 44));

        lblCompanyFtr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCompanyFtr.setText("Company : ");
        add(lblCompanyFtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 73, 44));

        lblModelNumberFtr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblModelNumberFtr.setText("Model/Serial/License No : ");
        add(lblModelNumberFtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 131, -1));

        lblModelNameFtr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblModelNameFtr.setText("Model Name : ");
        add(lblModelNameFtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 73, 44));

        selModelName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selModelName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selModelNameActionPerformed(evt);
            }
        });
        add(selModelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 156, 44));

        selSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selSeatsActionPerformed(evt);
            }
        });
        add(selSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 156, 44));

        lblSeatsFtr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSeatsFtr.setText("Seats : ");
        add(lblSeatsFtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 73, 44));

        btnApplyFtr.setText("Apply Filters");
        btnApplyFtr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyFtrActionPerformed(evt);
            }
        });
        add(btnApplyFtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, -1));

        btnClearFtr.setText("Clear Filters");
        btnClearFtr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFtrActionPerformed(evt);
            }
        });
        add(btnClearFtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        selCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selCityActionPerformed(evt);
            }
        });
        add(selCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 165, 44));

        lblCityFtr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCityFtr.setText("City : ");
        add(lblCityFtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 73, 44));

        selAvailability.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selAvailabilityActionPerformed(evt);
            }
        });
        add(selAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 165, 44));

        lblAvailabilityFtr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAvailabilityFtr.setText("Availability : ");
        add(lblAvailabilityFtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 73, 44));

        selMaintenanceCertificate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selMaintenanceCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selMaintenanceCertificateActionPerformed(evt);
            }
        });
        add(selMaintenanceCertificate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 165, 44));

        lblMaintainenceFtr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMaintainenceFtr.setText("Maint. Cert :");
        add(lblMaintainenceFtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 73, 44));

        lblManufacturingYearFtr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblManufacturingYearFtr.setText("Manf. Year : ");
        add(lblManufacturingYearFtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 73, 44));

        txtManufacturingYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturingYearActionPerformed(evt);
            }
        });
        add(txtManufacturingYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 160, 40));

        lblTotalCars.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalCars.setText("TOTAL CARS : ");
        add(lblTotalCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 384, 120, 30));

        txtTotalCars.setEditable(false);
        txtTotalCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCarsActionPerformed(evt);
            }
        });
        add(txtTotalCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 40, 30));

        title1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Cars List");
        add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 230, 30));

        txtLastUpdate.setEditable(false);
        txtLastUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastUpdateActionPerformed(evt);
            }
        });
        add(txtLastUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 740, 230, 30));

        lblLastUpdate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLastUpdate.setText("Last Updated at :");
        add(lblLastUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNumberActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        Integer selectedRow = viewTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this,"Please Select a row first");
            return;
        } else {
            myCarList.removeCar(selectedRow);
            JOptionPane.showMessageDialog(this,"Row deleted");
            populateTable(myCarList);
            populateMenu();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Integer selectedRow = viewTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please Select a car from table to view or edit its data");
            return;
        } else {
            DefaultTableModel model = (DefaultTableModel) viewTable.getModel();
            Car selectedCar = (Car) model.getValueAt(selectedRow, 0);
//            selectedCar = myCarList.getCar(selectedRow);
//            ViewPanel myViewPanel = new ViewPanel(myCarList, selectedRow);
                ViewPanel myViewPanel = new ViewPanel(rightPanel, myCarList, selectedCar);
                rightPanel.add("ViewPanel",myViewPanel);
                CardLayout layout = (CardLayout)rightPanel.getLayout();
                layout.next(rightPanel);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        populateTable(myCarList);
        populateMenu();
    }//GEN-LAST:event_formComponentShown

    private void selCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selCompanyActionPerformed

    private void selModelNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selModelNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selModelNameActionPerformed

    private void selSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selSeatsActionPerformed

    private void selCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selCityActionPerformed

    private void selAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selAvailabilityActionPerformed

    private void selMaintenanceCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selMaintenanceCertificateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selMaintenanceCertificateActionPerformed

    private void txtManufacturingYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturingYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturingYearActionPerformed

    private void btnApplyFtrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyFtrActionPerformed
        // TODO add your handling code here:
       String company = selCompany.getSelectedItem().toString();
       String modelName = selModelName.getSelectedItem().toString();
       String seats = selSeats.getSelectedItem().toString();
       String city = selCity.getSelectedItem().toString();
       String availability = selAvailability.getSelectedItem().toString();
       String maintenance = selMaintenanceCertificate.getSelectedItem().toString();
       String manufacturedYear = txtManufacturingYear.getText();
       String search = txtModelNumber.getText();
       
       // checking if the input into year field is valid or not
       if (!manufacturedYear.equals("") && !isValidNumber(manufacturedYear)){
           JOptionPane.showMessageDialog(this, "Manufacturing Year cannot have alphabets or symbols");
           return;
       }
       
       // company filter
       Carlist filteredCarList = new Carlist();
       for(Car c: myCarList.getCarArray()){
            if (company.equals("") || c.getCompany().equals(company)) {
               filteredCarList.add(c);
           }
       }
       
       // modelName Filter
       Carlist newFilterList = new Carlist();
       for(Car c: filteredCarList.getCarArray()){
            if (c.getModelName().equals(modelName) || modelName.equals("")) {
                newFilterList.add(c);
            }
       }
       filteredCarList = newFilterList;
       
       // seats filter
       Carlist newFilterList2 = new Carlist();
        for(Car c: filteredCarList.getCarArray()){
            if (String.valueOf(c.getSeats()).equals(seats) || seats.equals("")) {
                newFilterList2.add(c);
            }
       }
        filteredCarList = newFilterList2;
        
        // city filter
        Carlist newFilterList3 = new Carlist();
        for(Car c: filteredCarList.getCarArray()){
            if (c.getCity().equals(city) || city.equals("")) {
                newFilterList3.add(c);
            }
       }
        filteredCarList = newFilterList3;
        
        // availability filter
        Carlist newFilterList4 = new Carlist();
        for(Car c: filteredCarList.getCarArray()){
            if ((availability.equals("available") && c.getAvailability()) || (availability.equals("not available") && !c.getAvailability()) || availability.equals("")) {
                newFilterList4.add(c);
            }
       }
        filteredCarList = newFilterList4;
        
        // maint cert filter
        Carlist newFilterList5 = new Carlist();
        for(Car c: filteredCarList.getCarArray()){
            if ((maintenance.equals("valid") && c.getMaintenance()) || (maintenance.equals("expired") && !c.getMaintenance()) || maintenance.equals("")) {
                newFilterList5.add(c);
            }
       }
        filteredCarList = newFilterList5;
        
        // manufacturing year filter
        Carlist newFilterList6 = new Carlist();
        for(Car c: filteredCarList.getCarArray()){
            if (String.valueOf(c.getManufacturedYear()).equals(manufacturedYear)|| manufacturedYear.equals("")) {
                newFilterList6.add(c);
            }
       }
        filteredCarList = newFilterList6;
        
        // serialNumber, modelNumber or license filter
        Carlist newFilterList7 = new Carlist();
        for(Car c: filteredCarList.getCarArray()){
            if (String.valueOf(c.getModelNumber()).equals(search) || String.valueOf(c.getSerialNumber()).equals(search) || c.getNumberPlate().equals(search) || search.equals("")) {
                newFilterList7.add(c);
            }
       }
        filteredCarList = newFilterList7;
       
       // Final Table
       populateTable(filteredCarList);
       if (filteredCarList.getCarArray().size() == 0) {
           JOptionPane.showMessageDialog(this, "No Cars Available for current Selection");
       }
    }//GEN-LAST:event_btnApplyFtrActionPerformed

    private void btnClearFtrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFtrActionPerformed
        // TODO add your handling code here:
        populateTable(myCarList);
        populateMenu();
    }//GEN-LAST:event_btnClearFtrActionPerformed

    private void txtTotalCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCarsActionPerformed

    private void txtLastUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplyFtr;
    private javax.swing.JButton btnClearFtr;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel lblAvailabilityFtr;
    private javax.swing.JLabel lblCityFtr;
    private javax.swing.JLabel lblCompanyFtr;
    private javax.swing.JLabel lblLastUpdate;
    private javax.swing.JLabel lblMaintainenceFtr;
    private javax.swing.JLabel lblManufacturingYearFtr;
    private javax.swing.JLabel lblModelNameFtr;
    private javax.swing.JLabel lblModelNumberFtr;
    private javax.swing.JLabel lblSeatsFtr;
    private javax.swing.JLabel lblTotalCars;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JComboBox<String> selAvailability;
    private javax.swing.JComboBox<String> selCity;
    private javax.swing.JComboBox<String> selCompany;
    private javax.swing.JComboBox<String> selMaintenanceCertificate;
    private javax.swing.JComboBox<String> selModelName;
    private javax.swing.JComboBox<String> selSeats;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField txtLastUpdate;
    private javax.swing.JTextField txtManufacturingYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtTotalCars;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable(Carlist newCarlist) {
        DefaultTableModel model = (DefaultTableModel) viewTable.getModel();
        model.setRowCount(0);
        
        for(Car c: newCarlist.getCarArray()){
            Object[] row = new Object[4];
            row[0] = c;
            row[1] = c.getModelName();
            row[2] = c.getSeats();
            row[3] = c.getCity();
            
            model.addRow(row);
        }
        txtTotalCars.setText(String.valueOf(model.getRowCount()));
        txtLastUpdate.setText(new Date(Carlist.getLastUpdateTimeStamp()).toString());
    }

    private void populateMenu() {
        
        ArrayList<String> companyList = new ArrayList<String>();
        ArrayList<String> modelNameList = new ArrayList<String>();
        ArrayList<String> cityList = new ArrayList<String>();
        ArrayList<String> seatsList = new ArrayList<String>();
        ArrayList<String> AvailabilityList = new ArrayList<String>();
        ArrayList<String> MaintenanceList = new ArrayList<String>();
        companyList.add("");
        modelNameList.add("");
        cityList.add("");
        seatsList.add("");
        AvailabilityList.add("");
        MaintenanceList.add("");
        
        for(Car c : myCarList.getCarArray()) {
            // check if it is already present in the list before trying to add it to list
            if (!companyList.contains(c.getCompany()))companyList.add(c.getCompany());
            if (!modelNameList.contains(c.getModelName()))modelNameList.add(c.getModelName());
            if (!cityList.contains(c.getCity()))cityList.add(c.getCity());
            if (!seatsList.contains(String.valueOf(c.getSeats())))seatsList.add(String.valueOf(c.getSeats()));
        }
        
        // custom options for availability list and maintenance list
        AvailabilityList.add("available");
        AvailabilityList.add("not available");
        MaintenanceList.add("valid");
        MaintenanceList.add("expired");
        
        // convert arraylist to array
        String[] companies = companyList.toArray(new String[0]);
        String[] modelNames = modelNameList.toArray(new String[0]);
        String[] cities = cityList.toArray(new String[0]);
        String[] seats = seatsList.toArray(new String[0]);
        String[] availabilities = AvailabilityList.toArray(new String[0]);
        String[] maintenanceCertoptions = MaintenanceList.toArray(new String[0]);
        
        // populating the menus
        selCompany.setModel(new javax.swing.DefaultComboBoxModel<>(companies));
        selModelName.setModel(new javax.swing.DefaultComboBoxModel<>(modelNames));
        selCity.setModel(new javax.swing.DefaultComboBoxModel<>(cities));
        selSeats.setModel(new javax.swing.DefaultComboBoxModel<>(seats));
        selAvailability.setModel(new javax.swing.DefaultComboBoxModel<>(availabilities));
        selMaintenanceCertificate.setModel(new javax.swing.DefaultComboBoxModel<>(maintenanceCertoptions));
        txtManufacturingYear.setText("");
        txtModelNumber.setText("");
    }

    private boolean isValidNumber(String numberString) {
        boolean isValid = true;
        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            if (!(c>='0' && c<='9')) {
                isValid = false;
            }
        }
        return isValid;
    }
}
