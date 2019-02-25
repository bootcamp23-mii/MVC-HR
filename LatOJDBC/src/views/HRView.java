/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.EmployeeController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Employee;
import tools.DBConnection;

/**
 *
 * @author FES
 */
public class HRView extends javax.swing.JFrame {
    
    DBConnection connection = new DBConnection();
    
    EmployeeController ec = new EmployeeController(connection.getConnection());

    /**
     * Creates new form NewJFrame
     */
    public HRView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jIFEmployee = new javax.swing.JInternalFrame();
        jPEmployeeMain = new javax.swing.JPanel();
        jPEmployeeMainNorth = new javax.swing.JPanel();
        jLEmployeeTitle = new javax.swing.JLabel();
        jPEmployeeMainWest = new javax.swing.JPanel();
        jLEmployeeEmployeeId = new javax.swing.JLabel();
        jLEmployeeFirstName = new javax.swing.JLabel();
        jLEmployeeLastName = new javax.swing.JLabel();
        jLEmployeeEmail = new javax.swing.JLabel();
        jLEmployeePhoneNumber = new javax.swing.JLabel();
        jLEmployeeHireDate = new javax.swing.JLabel();
        jLEmployeeJobId = new javax.swing.JLabel();
        jLEmployeeSalary = new javax.swing.JLabel();
        jLEmployeeCommissionPct = new javax.swing.JLabel();
        jLEmployeeManagerId = new javax.swing.JLabel();
        jLEmployeeDepartmentId = new javax.swing.JLabel();
        jSEmployees1 = new javax.swing.JSeparator();
        jLEmployeeSearch = new javax.swing.JLabel();
        jPEmployeeMainCenter = new javax.swing.JPanel();
        jTFEmployeeEmployeeId = new javax.swing.JTextField();
        jTFEmployeeFirstName = new javax.swing.JTextField();
        jTFEmployeeLastName = new javax.swing.JTextField();
        jTFEmployeeEmail = new javax.swing.JTextField();
        jTFEmployeePhoneNumber = new javax.swing.JTextField();
        jTFEmployeeHireDate = new javax.swing.JTextField();
        jTFEmployeeJobId = new javax.swing.JTextField();
        jTFEmployeeSalary = new javax.swing.JTextField();
        jTFEmployeeCommissionPct = new javax.swing.JTextField();
        jTFEmployeeManagerId = new javax.swing.JTextField();
        jTFEmployeeDepartmentId = new javax.swing.JTextField();
        jPEmployeeMainCenterContent1 = new javax.swing.JPanel();
        jBEmployeeInsert = new javax.swing.JButton();
        jBEmployeeUpdate = new javax.swing.JButton();
        jPEmployeeMainCenterContent2 = new javax.swing.JPanel();
        jTFEmployeeSearch = new javax.swing.JTextField();
        jPEmployeeMainCenterContent3 = new javax.swing.JPanel();
        jBEmployeeDelete = new javax.swing.JButton();
        jSEmployees2 = new javax.swing.JSeparator();
        jBEmployeeSearch = new javax.swing.JButton();
        jCBEmployeeisGetById = new javax.swing.JCheckBox();
        jSEmployees3 = new javax.swing.JSeparator();
        jBEmployeeGetAll = new javax.swing.JButton();
        jPEmployeeMainSouth = new javax.swing.JPanel();
        jSPEmployee = new javax.swing.JScrollPane();
        jTEmployee = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMIEmployee = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMain.setLayout(new javax.swing.OverlayLayout(jPanelMain));

        jIFEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jIFEmployee.setClosable(true);
        jIFEmployee.setMinimumSize(new java.awt.Dimension(200, 200));
        jIFEmployee.setNormalBounds(new java.awt.Rectangle(0, 0, 200, 200));
        jIFEmployee.setVisible(false);

        jPEmployeeMain.setLayout(new java.awt.BorderLayout(1, 1));

        jLEmployeeTitle.setText("EMPLOYEES");
        jPEmployeeMainNorth.add(jLEmployeeTitle);

        jPEmployeeMain.add(jPEmployeeMainNorth, java.awt.BorderLayout.PAGE_START);

        jPEmployeeMainWest.setLayout(new java.awt.GridLayout(14, 1));

        jLEmployeeEmployeeId.setText("Employee ID");
        jPEmployeeMainWest.add(jLEmployeeEmployeeId);

        jLEmployeeFirstName.setText("First Name");
        jPEmployeeMainWest.add(jLEmployeeFirstName);

        jLEmployeeLastName.setText("Last Name");
        jPEmployeeMainWest.add(jLEmployeeLastName);

        jLEmployeeEmail.setText("Email");
        jPEmployeeMainWest.add(jLEmployeeEmail);

        jLEmployeePhoneNumber.setText("Phone Number");
        jPEmployeeMainWest.add(jLEmployeePhoneNumber);

        jLEmployeeHireDate.setText("Hire Date");
        jPEmployeeMainWest.add(jLEmployeeHireDate);

        jLEmployeeJobId.setText("Job Id");
        jPEmployeeMainWest.add(jLEmployeeJobId);

        jLEmployeeSalary.setText("Salary");
        jPEmployeeMainWest.add(jLEmployeeSalary);

        jLEmployeeCommissionPct.setText("Commission Pct");
        jPEmployeeMainWest.add(jLEmployeeCommissionPct);

        jLEmployeeManagerId.setText("Manager Id");
        jPEmployeeMainWest.add(jLEmployeeManagerId);

        jLEmployeeDepartmentId.setText("Department Id");
        jPEmployeeMainWest.add(jLEmployeeDepartmentId);
        jPEmployeeMainWest.add(jSEmployees1);

        jLEmployeeSearch.setText("Search/Delete");
        jPEmployeeMainWest.add(jLEmployeeSearch);

        jPEmployeeMain.add(jPEmployeeMainWest, java.awt.BorderLayout.LINE_START);

        jPEmployeeMainCenter.setLayout(new java.awt.GridLayout(14, 1));

        jTFEmployeeEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmployeeEmployeeIdActionPerformed(evt);
            }
        });
        jPEmployeeMainCenter.add(jTFEmployeeEmployeeId);
        jPEmployeeMainCenter.add(jTFEmployeeFirstName);
        jPEmployeeMainCenter.add(jTFEmployeeLastName);
        jPEmployeeMainCenter.add(jTFEmployeeEmail);
        jPEmployeeMainCenter.add(jTFEmployeePhoneNumber);
        jPEmployeeMainCenter.add(jTFEmployeeHireDate);
        jPEmployeeMainCenter.add(jTFEmployeeJobId);
        jPEmployeeMainCenter.add(jTFEmployeeSalary);
        jPEmployeeMainCenter.add(jTFEmployeeCommissionPct);
        jPEmployeeMainCenter.add(jTFEmployeeManagerId);
        jPEmployeeMainCenter.add(jTFEmployeeDepartmentId);

        jPEmployeeMainCenterContent1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jBEmployeeInsert.setText("Insert");
        jBEmployeeInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmployeeInsertActionPerformed(evt);
            }
        });
        jPEmployeeMainCenterContent1.add(jBEmployeeInsert);

        jBEmployeeUpdate.setText("Update");
        jBEmployeeUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmployeeUpdateActionPerformed(evt);
            }
        });
        jPEmployeeMainCenterContent1.add(jBEmployeeUpdate);

        jPEmployeeMainCenter.add(jPEmployeeMainCenterContent1);

        jPEmployeeMainCenterContent2.setLayout(new java.awt.GridLayout(1, 0));
        jPEmployeeMainCenterContent2.add(jTFEmployeeSearch);

        jPEmployeeMainCenter.add(jPEmployeeMainCenterContent2);

        jPEmployeeMainCenterContent3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jBEmployeeDelete.setText("Delete by ID");
        jBEmployeeDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmployeeDeleteActionPerformed(evt);
            }
        });
        jPEmployeeMainCenterContent3.add(jBEmployeeDelete);
        jPEmployeeMainCenterContent3.add(jSEmployees2);

        jBEmployeeSearch.setText("Search");
        jBEmployeeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmployeeSearchActionPerformed(evt);
            }
        });
        jPEmployeeMainCenterContent3.add(jBEmployeeSearch);

        jCBEmployeeisGetById.setText("Get By ID");
        jCBEmployeeisGetById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEmployeeisGetByIdActionPerformed(evt);
            }
        });
        jPEmployeeMainCenterContent3.add(jCBEmployeeisGetById);
        jPEmployeeMainCenterContent3.add(jSEmployees3);

        jBEmployeeGetAll.setText("Get All Data");
        jBEmployeeGetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmployeeGetAllActionPerformed(evt);
            }
        });
        jPEmployeeMainCenterContent3.add(jBEmployeeGetAll);

        jPEmployeeMainCenter.add(jPEmployeeMainCenterContent3);

        jPEmployeeMain.add(jPEmployeeMainCenter, java.awt.BorderLayout.CENTER);

        jTEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Email", "Phone Number", "Hire Date", "Job ID", "Salary", "Commission Pct", "Manager ID", "Department ID"
            }
        ));
        jSPEmployee.setViewportView(jTEmployee);

        javax.swing.GroupLayout jPEmployeeMainSouthLayout = new javax.swing.GroupLayout(jPEmployeeMainSouth);
        jPEmployeeMainSouth.setLayout(jPEmployeeMainSouthLayout);
        jPEmployeeMainSouthLayout.setHorizontalGroup(
            jPEmployeeMainSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSPEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        jPEmployeeMainSouthLayout.setVerticalGroup(
            jPEmployeeMainSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEmployeeMainSouthLayout.createSequentialGroup()
                .addComponent(jSPEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPEmployeeMain.add(jPEmployeeMainSouth, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jIFEmployeeLayout = new javax.swing.GroupLayout(jIFEmployee.getContentPane());
        jIFEmployee.getContentPane().setLayout(jIFEmployeeLayout);
        jIFEmployeeLayout.setHorizontalGroup(
            jIFEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIFEmployeeLayout.createSequentialGroup()
                .addComponent(jPEmployeeMain, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jIFEmployeeLayout.setVerticalGroup(
            jIFEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPEmployeeMain, javax.swing.GroupLayout.PREFERRED_SIZE, 670, Short.MAX_VALUE)
        );

        jPanelMain.add(jIFEmployee);

        jMenu1.setText("CRUD");

        jMIEmployee.setText("Employees");
        jMIEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEmployeeActionPerformed(evt);
            }
        });
        jMenu1.add(jMIEmployee);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEmployeeActionPerformed
        jIFEmployee.setVisible(true);
//        jIFEmployee.setBounds(5, 5, 200, 300);
        jIFEmployee.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jIFEmployee.revalidate();
//        jPanel1.add(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);
    }//GEN-LAST:event_jMIEmployeeActionPerformed

    private void jBEmployeeInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmployeeInsertActionPerformed
        ec.insert(jTFEmployeeEmployeeId.getText(), jTFEmployeeFirstName.getText(), jTFEmployeeLastName.getText(), jTFEmployeeEmail.getText(), jTFEmployeePhoneNumber.getText(), jTFEmployeeHireDate.getText(), jTFEmployeeJobId.getText(), jTFEmployeeSalary.getText(), jTFEmployeeCommissionPct.getText(), jTFEmployeeManagerId.getText(), jTFEmployeeDepartmentId.getText());
    }//GEN-LAST:event_jBEmployeeInsertActionPerformed

    private void jBEmployeeUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmployeeUpdateActionPerformed
        ec.update(jTFEmployeeEmployeeId.getText(), jTFEmployeeFirstName.getText(), jTFEmployeeLastName.getText(), jTFEmployeeEmail.getText(), jTFEmployeePhoneNumber.getText(), jTFEmployeeHireDate.getText(), jTFEmployeeJobId.getText(), jTFEmployeeSalary.getText(), jTFEmployeeCommissionPct.getText(), jTFEmployeeManagerId.getText(), jTFEmployeeDepartmentId.getText());
    }//GEN-LAST:event_jBEmployeeUpdateActionPerformed

    private void jTFEmployeeEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmployeeEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmployeeEmployeeIdActionPerformed

    private void jCBEmployeeisGetByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEmployeeisGetByIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBEmployeeisGetByIdActionPerformed

    private void jBEmployeeGetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmployeeGetAllActionPerformed
        DefaultTableModel tableModelEmployee = (DefaultTableModel) jTEmployee.getModel();
        tableModelEmployee.setRowCount(0);
        for (Employee value : ec.getAllData()) {
            Object[] data = {value.getEmployeeId(),value.getFirst_name(),
                value.getLast_name(),value.getEmail(),value.getPhone_number(),
                value.getHire_date(),value.getJob_id(),value.getSalary(),
                value.getCommission_pct(),value.getManager_id(),value.getDepartment_id()
            };
            tableModelEmployee.addRow(data);
        }
        
    }//GEN-LAST:event_jBEmployeeGetAllActionPerformed

    private void jBEmployeeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmployeeSearchActionPerformed
        DefaultTableModel tableModelEmployee = (DefaultTableModel) jTEmployee.getModel();
        tableModelEmployee.setRowCount(0);
        for (Employee value : ec.searchData(jTFEmployeeSearch.getText().toString(), jCBEmployeeisGetById.isSelected())) {
            Object[] data = {value.getEmployeeId(),value.getFirst_name(),
                value.getLast_name(),value.getEmail(),value.getPhone_number(),
                value.getHire_date(),value.getJob_id(),value.getSalary(),
                value.getCommission_pct(),value.getManager_id(),value.getDepartment_id()
            };
            tableModelEmployee.addRow(data);
        }
        
    }//GEN-LAST:event_jBEmployeeSearchActionPerformed

    private void jBEmployeeDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmployeeDeleteActionPerformed
//        ec.delete(jTFEmployeeSearch.getText());
        JOptionPane.showMessageDialog(getRootPane(), ""+jTFEmployeeSearch.getText().toString());
    }//GEN-LAST:event_jBEmployeeDeleteActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HRView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEmployeeDelete;
    private javax.swing.JButton jBEmployeeGetAll;
    private javax.swing.JButton jBEmployeeInsert;
    private javax.swing.JButton jBEmployeeSearch;
    private javax.swing.JButton jBEmployeeUpdate;
    private javax.swing.JCheckBox jCBEmployeeisGetById;
    private javax.swing.JInternalFrame jIFEmployee;
    private javax.swing.JLabel jLEmployeeCommissionPct;
    private javax.swing.JLabel jLEmployeeDepartmentId;
    private javax.swing.JLabel jLEmployeeEmail;
    private javax.swing.JLabel jLEmployeeEmployeeId;
    private javax.swing.JLabel jLEmployeeFirstName;
    private javax.swing.JLabel jLEmployeeHireDate;
    private javax.swing.JLabel jLEmployeeJobId;
    private javax.swing.JLabel jLEmployeeLastName;
    private javax.swing.JLabel jLEmployeeManagerId;
    private javax.swing.JLabel jLEmployeePhoneNumber;
    private javax.swing.JLabel jLEmployeeSalary;
    private javax.swing.JLabel jLEmployeeSearch;
    private javax.swing.JLabel jLEmployeeTitle;
    private javax.swing.JMenuItem jMIEmployee;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPEmployeeMain;
    private javax.swing.JPanel jPEmployeeMainCenter;
    private javax.swing.JPanel jPEmployeeMainCenterContent1;
    private javax.swing.JPanel jPEmployeeMainCenterContent2;
    private javax.swing.JPanel jPEmployeeMainCenterContent3;
    private javax.swing.JPanel jPEmployeeMainNorth;
    private javax.swing.JPanel jPEmployeeMainSouth;
    private javax.swing.JPanel jPEmployeeMainWest;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JSeparator jSEmployees1;
    private javax.swing.JSeparator jSEmployees2;
    private javax.swing.JSeparator jSEmployees3;
    private javax.swing.JScrollPane jSPEmployee;
    private javax.swing.JTable jTEmployee;
    private javax.swing.JTextField jTFEmployeeCommissionPct;
    private javax.swing.JTextField jTFEmployeeDepartmentId;
    private javax.swing.JTextField jTFEmployeeEmail;
    private javax.swing.JTextField jTFEmployeeEmployeeId;
    private javax.swing.JTextField jTFEmployeeFirstName;
    private javax.swing.JTextField jTFEmployeeHireDate;
    private javax.swing.JTextField jTFEmployeeJobId;
    private javax.swing.JTextField jTFEmployeeLastName;
    private javax.swing.JTextField jTFEmployeeManagerId;
    private javax.swing.JTextField jTFEmployeePhoneNumber;
    private javax.swing.JTextField jTFEmployeeSalary;
    private javax.swing.JTextField jTFEmployeeSearch;
    // End of variables declaration//GEN-END:variables
}
