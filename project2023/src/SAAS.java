
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aleksandarpd
 */





public class SAAS extends javax.swing.JFrame {

    /**
     * Creates new form project_frame
     */
    
    static DynamicArray clients = new DynamicArray();
    
    public SAAS() {
        initComponents();
        int[] money = {1,2,3,4,5,6,7,8,9,10,11}; 
//        JTable table = new JTable(new MyTableModel());
        
        TableColumn column = null;

        
    }
    public double calculate(){


        return (Math.pow(1+ Double.parseDouble(lihva.getText())/100, Double.parseDouble(srok.getText()))) * Double.parseDouble(kredit.getText());


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BankCalulator = new javax.swing.JPanel();
        bank_name = new javax.swing.JLabel();
        kredit_text = new javax.swing.JLabel();
        kredit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        srok = new javax.swing.JTextField();
        lihva = new javax.swing.JTextField();
        button_kalkulirane = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        obshto_vryshtash = new javax.swing.JLabel();
        btnShowStatistic = new javax.swing.JButton();
        txtErrors = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BankCalulator.setBackground(new java.awt.Color(20, 59, 121));

        bank_name.setBackground(new java.awt.Color(255, 255, 255));
        bank_name.setForeground(new java.awt.Color(255, 255, 255));
        bank_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bank_name.setText("Bank СААС");
        bank_name.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        kredit_text.setBackground(new java.awt.Color(255, 255, 255));
        kredit_text.setForeground(new java.awt.Color(255, 255, 255));
        kredit_text.setText("Kredit:");

        kredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kreditActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Term(Months):");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Interest(in %):");

        srok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srokActionPerformed(evt);
            }
        });

        lihva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihvaActionPerformed(evt);
            }
        });

        button_kalkulirane.setBackground(new java.awt.Color(51, 51, 255));
        button_kalkulirane.setForeground(new java.awt.Color(255, 255, 255));
        button_kalkulirane.setText("Calculate");
        button_kalkulirane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kalkuliraneActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Calculator for loan repayment");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("You will return:");

        obshto_vryshtash.setBackground(new java.awt.Color(255, 255, 255));
        obshto_vryshtash.setForeground(new java.awt.Color(255, 255, 255));
        obshto_vryshtash.setText("0.00");

        btnShowStatistic.setBackground(new java.awt.Color(51, 51, 255));
        btnShowStatistic.setForeground(new java.awt.Color(255, 255, 255));
        btnShowStatistic.setText("Show statistics for clients");
        btnShowStatistic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowStatisticActionPerformed(evt);
            }
        });

        txtErrors.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout BankCalulatorLayout = new javax.swing.GroupLayout(BankCalulator);
        BankCalulator.setLayout(BankCalulatorLayout);
        BankCalulatorLayout.setHorizontalGroup(
            BankCalulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BankCalulatorLayout.createSequentialGroup()
                .addGroup(BankCalulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BankCalulatorLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(BankCalulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BankCalulatorLayout.createSequentialGroup()
                                .addGroup(BankCalulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BankCalulatorLayout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(obshto_vryshtash))
                                    .addComponent(button_kalkulirane, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnShowStatistic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtErrors)))
                    .addGroup(BankCalulatorLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(BankCalulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BankCalulatorLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(BankCalulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BankCalulatorLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(srok, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BankCalulatorLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(BankCalulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addGroup(BankCalulatorLayout.createSequentialGroup()
                                                .addComponent(kredit_text)
                                                .addGap(18, 18, 18)
                                                .addComponent(kredit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BankCalulatorLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lihva, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BankCalulatorLayout.setVerticalGroup(
            BankCalulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BankCalulatorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(BankCalulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kredit_text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BankCalulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(srok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BankCalulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lihva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtErrors, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BankCalulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BankCalulatorLayout.createSequentialGroup()
                        .addComponent(button_kalkulirane)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BankCalulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(obshto_vryshtash)
                            .addComponent(jLabel5)))
                    .addComponent(btnShowStatistic))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BankCalulator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BankCalulator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lihvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lihvaActionPerformed

    private void kreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kreditActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_kreditActionPerformed

    private void button_kalkuliraneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kalkuliraneActionPerformed
        
        try{
            
            String kreditCalc = kredit.getText();
            String termCalc = srok.getText();
            String lihvaCalc = lihva.getText();
            
            txtErrors.setText("");
            
            boolean flag = true;
            
            if(!kreditCalc.isEmpty()){
                if(Double.parseDouble(kreditCalc)<0.0){
                    txtErrors.setText(txtErrors.getText() + "Kredit can't be negative value. ");
                    flag = false;
                }
            }else{
                txtErrors.setText("There's empty space.");
                flag = false;
            }
            
            if(!termCalc.isEmpty()){
                if(Double.parseDouble(termCalc)<0.0){
                    txtErrors.setText(txtErrors.getText() + "Term can't be negative value. ");
                    flag = false;
                }
            }else{
                txtErrors.setText("There's empty space.");
                flag = false;
            }
            
            
            if(!lihvaCalc.isEmpty()){
                if(Double.parseDouble(lihvaCalc)<0.0){
                    txtErrors.setText(txtErrors.getText() + "Loan can't be negative value. ");
                    flag = false;
                }
            }else{
                txtErrors.setText("There's empty space.");
                flag = false;
            }
            
            
            if(flag){
                obshto_vryshtash.setText(Double.toString(((double) (Math.round(calculate()*100.0)/100.0))));    
            }else{
                obshto_vryshtash.setText("0.00");
            }
            
            
              
            
             
            
        }catch(Exception NumberFormatException){
            txtErrors.setText("Write only NUMBERS");
        }
        
    }//GEN-LAST:event_button_kalkuliraneActionPerformed

    private void btnShowStatisticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowStatisticActionPerformed
        this.dispose();
        new TableSort().setVisible(true);
    }//GEN-LAST:event_btnShowStatisticActionPerformed

    private void srokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srokActionPerformed

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
            java.util.logging.Logger.getLogger(SAAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SAAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SAAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SAAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SAAS().setVisible(true);
                //MAIN
                
                
                 
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BankCalulator;
    private javax.swing.JLabel bank_name;
    private javax.swing.JButton btnShowStatistic;
    private javax.swing.JButton button_kalkulirane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField kredit;
    private javax.swing.JLabel kredit_text;
    private javax.swing.JTextField lihva;
    private javax.swing.JLabel obshto_vryshtash;
    private javax.swing.JTextField srok;
    private javax.swing.JLabel txtErrors;
    // End of variables declaration//GEN-END:variables
}
