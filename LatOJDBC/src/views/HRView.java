/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author FES
 */
public class HRView extends javax.swing.JFrame {

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
        jLEmployeeEmployeeID = new javax.swing.JLabel();
        jLEmployeeFirstName = new javax.swing.JLabel();
        jLEmployeeLastName = new javax.swing.JLabel();
        jLEmployeeEmail = new javax.swing.JLabel();
        jLEmployeePhoneNumber = new javax.swing.JLabel();
        jLEmployeeHireDate = new javax.swing.JLabel();
        jLEmployeeJobID = new javax.swing.JLabel();
        jLEmployeeSalary = new javax.swing.JLabel();
        jLEmployeeCommissionPct = new javax.swing.JLabel();
        jLEmployeeManagerID = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPEmployeeMainCenter = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jBEmployeeInsert = new javax.swing.JButton();
        jBEmployeeUpdate = new javax.swing.JButton();
        jPEmployeeMainSouth = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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

        jPEmployeeMainWest.setLayout(new java.awt.GridLayout(15, 1));

        jLEmployeeEmployeeID.setText("Employee ID");
        jPEmployeeMainWest.add(jLEmployeeEmployeeID);

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

        jLEmployeeJobID.setText("Job Id");
        jPEmployeeMainWest.add(jLEmployeeJobID);

        jLEmployeeSalary.setText("Salary");
        jPEmployeeMainWest.add(jLEmployeeSalary);

        jLEmployeeCommissionPct.setText("Commission Pct");
        jPEmployeeMainWest.add(jLEmployeeCommissionPct);

        jLEmployeeManagerID.setText("Manager Id");
        jPEmployeeMainWest.add(jLEmployeeManagerID);

        jLabel12.setText("Department Id");
        jPEmployeeMainWest.add(jLabel12);

        jPEmployeeMain.add(jPEmployeeMainWest, java.awt.BorderLayout.LINE_START);

        jPEmployeeMainCenter.setLayout(new java.awt.GridLayout(15, 1));

        jTextField1.setText("jTextField1");
        jPEmployeeMainCenter.add(jTextField1);

        jTextField2.setText("jTextField2");
        jPEmployeeMainCenter.add(jTextField2);

        jTextField3.setText("jTextField3");
        jPEmployeeMainCenter.add(jTextField3);

        jTextField4.setText("jTextField4");
        jPEmployeeMainCenter.add(jTextField4);

        jTextField5.setText("jTextField5");
        jPEmployeeMainCenter.add(jTextField5);

        jTextField6.setText("jTextField6");
        jPEmployeeMainCenter.add(jTextField6);

        jTextField7.setText("jTextField7");
        jPEmployeeMainCenter.add(jTextField7);

        jTextField8.setText("jTextField8");
        jPEmployeeMainCenter.add(jTextField8);

        jTextField9.setText("jTextField9");
        jPEmployeeMainCenter.add(jTextField9);

        jTextField10.setText("jTextField10");
        jPEmployeeMainCenter.add(jTextField10);

        jTextField11.setText("jTextField11");
        jPEmployeeMainCenter.add(jTextField11);

        jBEmployeeInsert.setText("Insert");
        jBEmployeeInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmployeeInsertActionPerformed(evt);
            }
        });
        jPanel7.add(jBEmployeeInsert);

        jBEmployeeUpdate.setText("Update");
        jBEmployeeUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmployeeUpdateActionPerformed(evt);
            }
        });
        jPanel7.add(jBEmployeeUpdate);

        jPEmployeeMainCenter.add(jPanel7);

        jPEmployeeMain.add(jPEmployeeMainCenter, java.awt.BorderLayout.CENTER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPEmployeeMainSouthLayout = new javax.swing.GroupLayout(jPEmployeeMainSouth);
        jPEmployeeMainSouth.setLayout(jPEmployeeMainSouthLayout);
        jPEmployeeMainSouthLayout.setHorizontalGroup(
            jPEmployeeMainSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        jPEmployeeMainSouthLayout.setVerticalGroup(
            jPEmployeeMainSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEmployeeMainSouthLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPEmployeeMain.add(jPEmployeeMainSouth, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jIFEmployeeLayout = new javax.swing.GroupLayout(jIFEmployee.getContentPane());
        jIFEmployee.getContentPane().setLayout(jIFEmployeeLayout);
        jIFEmployeeLayout.setHorizontalGroup(
            jIFEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPEmployeeMain, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jIFEmployeeLayout.setVerticalGroup(
            jIFEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPEmployeeMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelMain.add(jIFEmployee);

        jMenu1.setText("CRUD");

        jMenuItem1.setText("Employees");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

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
            .addComponent(jPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jIFEmployee.setVisible(true);
//        jIFEmployee.setBounds(5, 5, 200, 300);
        jIFEmployee.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jIFEmployee.revalidate();
//        jPanel1.add(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBEmployeeInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmployeeInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEmployeeInsertActionPerformed

    private void jBEmployeeUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmployeeUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEmployeeUpdateActionPerformed

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
    private javax.swing.JButton jBEmployeeInsert;
    private javax.swing.JButton jBEmployeeUpdate;
    private javax.swing.JInternalFrame jIFEmployee;
    private javax.swing.JLabel jLEmployeeCommissionPct;
    private javax.swing.JLabel jLEmployeeEmail;
    private javax.swing.JLabel jLEmployeeEmployeeID;
    private javax.swing.JLabel jLEmployeeFirstName;
    private javax.swing.JLabel jLEmployeeHireDate;
    private javax.swing.JLabel jLEmployeeJobID;
    private javax.swing.JLabel jLEmployeeLastName;
    private javax.swing.JLabel jLEmployeeManagerID;
    private javax.swing.JLabel jLEmployeePhoneNumber;
    private javax.swing.JLabel jLEmployeeSalary;
    private javax.swing.JLabel jLEmployeeTitle;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPEmployeeMain;
    private javax.swing.JPanel jPEmployeeMainCenter;
    private javax.swing.JPanel jPEmployeeMainNorth;
    private javax.swing.JPanel jPEmployeeMainSouth;
    private javax.swing.JPanel jPEmployeeMainWest;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
