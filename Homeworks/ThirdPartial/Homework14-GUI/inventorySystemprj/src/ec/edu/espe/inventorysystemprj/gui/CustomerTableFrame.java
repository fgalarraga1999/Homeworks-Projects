/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inventorysystemprj.gui;

import ec.edu.espe.inventorysystemprj.cmd.Customer;
import ec.edu.espe.inventorysystemprj.utils.FilePrj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernanda Galárraga
 */
public class CustomerTableFrame extends javax.swing.JFrame {

    /**
     * Creates new form CustomerTableFrame
     */
    public CustomerTableFrame() throws IOException  {
        initComponents();
        ArrayList<Customer>customer=new ArrayList<Customer>();
        FilePrj file= new FilePrj();
        customer=file.readCustomer("Customer.csv");
        this.showCustomer(customer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mnuMenuBar = new javax.swing.JMenuBar();
        mnuNavegator = new javax.swing.JMenu();
        mnuReturn = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        mnuSalesNote = new javax.swing.JMenu();
        mnuAdd = new javax.swing.JMenuItem();
        mnuList = new javax.swing.JMenuItem();
        mnuRegister = new javax.swing.JMenu();
        mnuAddCustomer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCustomer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 287));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/inventorysystemprj/images/JMGDistribucionesLogo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 190, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/inventorysystemprj/images/background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 400));

        mnuNavegator.setText("Navegación");

        mnuReturn.setText("Regresar");
        mnuReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuReturnMouseClicked(evt);
            }
        });
        mnuReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReturnActionPerformed(evt);
            }
        });
        mnuNavegator.add(mnuReturn);

        mnuExit.setText("Salir");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnuNavegator.add(mnuExit);

        mnuMenuBar.add(mnuNavegator);

        mnuSalesNote.setText("Nota de Venta");

        mnuAdd.setText("Añadir Productos");
        mnuAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAddActionPerformed(evt);
            }
        });
        mnuSalesNote.add(mnuAdd);

        mnuList.setText("Lista de Compras");
        mnuList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListActionPerformed(evt);
            }
        });
        mnuSalesNote.add(mnuList);

        mnuMenuBar.add(mnuSalesNote);

        mnuRegister.setText("Registro Cliente");

        mnuAddCustomer.setText("Añadir cliente");
        mnuAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAddCustomerActionPerformed(evt);
            }
        });
        mnuRegister.add(mnuAddCustomer);

        mnuMenuBar.add(mnuRegister);

        setJMenuBar(mnuMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuReturnMouseClicked
        
    }//GEN-LAST:event_mnuReturnMouseClicked

    private void mnuReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReturnActionPerformed
       SellMenu seller = new SellMenu();
        this.setVisible(false);
        seller.setVisible(true);
        dispose();
    }//GEN-LAST:event_mnuReturnActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAddActionPerformed
        SalesNoteFrame sales;
        try {
            this.setVisible(false);
            sales = new SalesNoteFrame();
            sales.setVisible(true);
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(ListOfShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuAddActionPerformed

    private void mnuListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListActionPerformed
       try {
            this.setVisible(false);
            ListOfShop list = new ListOfShop();
            list.setVisible(true);
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(CustomerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuListActionPerformed

    private void mnuAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAddCustomerActionPerformed
      CustomerFrame customer;
        customer = new CustomerFrame();
        customer.setVisible(true);
        dispose();
        this.setVisible(false);       

    }//GEN-LAST:event_mnuAddCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerTableFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerTableFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerTableFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerTableFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CustomerTableFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(CustomerTableFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void showCustomer (ArrayList<Customer>customer){
       String matriz[][] = new String[customer.size()][10];
                for (int i = 0; i < customer.size(); i++) {

                    matriz[i][0] = customer.get(i).getNameAndSurname();
                    matriz[i][1] = String.valueOf(customer.get(i).getId());
                    matriz[i][2] = String.valueOf(customer.get(i).getPhone());
                    matriz[i][3] = customer.get(i).getAddress();
                    }
     tblCustomer.setModel(new javax.swing.table.DefaultTableModel( matriz,new String []{"Nombre","Cédula","Teléfono","Dirección"}));               
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuAdd;
    private javax.swing.JMenuItem mnuAddCustomer;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuList;
    private javax.swing.JMenuBar mnuMenuBar;
    private javax.swing.JMenu mnuNavegator;
    private javax.swing.JMenu mnuRegister;
    private javax.swing.JMenuItem mnuReturn;
    private javax.swing.JMenu mnuSalesNote;
    private javax.swing.JTable tblCustomer;
    // End of variables declaration//GEN-END:variables
}
